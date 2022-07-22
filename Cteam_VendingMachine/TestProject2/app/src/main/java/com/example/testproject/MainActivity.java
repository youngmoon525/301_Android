package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int cnt1, cnt2, cnt3, cnt4;  // 안쓰는변수 지우기.!!!!!!

    /*제목 : 안드로이드 과제 피드백
    * 날짜 : 2022-07-22
    * 내용 : 반복되는 구간은 메소드 처리가 필요함.
    *        안쓰는 변수는 회색으로 표시되니 지우기.
    *
    * */


    Button btn_shin, btn_jin, btn_yeol, btn_hc, btn_price, btn_result, btn_rn;
    TextView txt_main, txt_shin, txt_jin, txt_yeol, txt_hc, txt_rn;
    EditText ed_txt;
    int money = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_shin = findViewById(R.id.btn_shin);
        btn_price = findViewById(R.id.btn_price);
        btn_rn= findViewById(R.id.btn_rn);
        ed_txt = findViewById(R.id.ed_txt);
        btn_jin = findViewById(R.id.btn_jin);
        btn_jin = findViewById(R.id.btn_jin);
        btn_result = findViewById(R.id.btn_result);
        txt_rn = findViewById(R.id.txt_rn);
        txt_main = findViewById(R.id.txt_main);
        btn_yeol = findViewById(R.id.btn_yeol);
        btn_hc = findViewById(R.id.btn_hc);
        txt_shin = findViewById(R.id.txt_shin);
        txt_jin = findViewById(R.id.txt_jin);
        txt_yeol = findViewById(R.id.txt_yeol);
        txt_hc = findViewById(R.id.txt_hc);

        //※
        final InputMethodManager manager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);

        ArrayList<RamenDTO> list = new ArrayList<>();


        list.add(new RamenDTO(10, 900, 0, "신라면"));
        list.add(new RamenDTO(10, 800, 0, "진라면"));
        list.add(new RamenDTO(10, 700, 0, "열라면"));
        list.add(new RamenDTO(10, 1100, 0, "불닭라면"));
        list.add(new RamenDTO(1,1000,0,"랜덤"));

        //돈 입력하고 금액입력을 눌렀을때
        btn_price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //try catch 처리 필요함
                manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                money += Integer.parseInt(ed_txt.getText().toString());
                ed_txt.setText(""); //금액은 다시 공백처리
                txt_main.setText("잔액 : " + money + "원");

            }
        });

        btn_shin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (money < list.get(0).price) {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();
                } else {

                    if (list.get(0).cnt > 0) {

                        //돈을 차감하고
                        money -= list.get(0).price;
                        txt_main.setText(money + "");
                        //갯수를 빼준다
                        list.get(0).cnt--;
                        txt_shin.setText(list.get(0).cnt + "개 남음");


                        //버튼 누른 횟수로 내가 구매한 갯수 파악
                        list.get(0).count++;

                    } else {
                        Toast.makeText(MainActivity.this, "품절 입니다.", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        btn_jin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (money < list.get(1).price) {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();

                } else {
                    if (list.get(1).cnt > 0) {
                        //금액을 빼주자 얼마만큼? -800만큼 인데
                        money -= list.get(1).price;
                        txt_main.setText(money + "");
                        //갯수빼주고
                        list.get(1).cnt--;

                        txt_jin.setText(list.get(1).cnt + "개 남음");
                        //버튼 누른 횟수로 내가 구매한 갯수 파악
                        list.get(1).count++;


                    } else {
                        Toast.makeText(MainActivity.this, "품절 입니다.", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        btn_yeol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (money < list.get(2).price) {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();

                } else {
                    if (list.get(2).cnt > 0) {
                        //금액을 빼주자 얼마만큼? -800만큼 인데
                        money -= list.get(2).price;
                        txt_main.setText(money + "");
                        //갯수빼주고
                        list.get(2).cnt--;
                        txt_yeol.setText(list.get(2).cnt + "개 남음");
                        //버튼 누른 횟수로 내가 구매한 갯수 파악
                        list.get(2).count++;


                    } else {
                        Toast.makeText(MainActivity.this, "품절 입니다.", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        btn_hc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (money < list.get(3).price) {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();

                } else {
                    if (list.get(3).cnt > 0) {
                        //금액을 빼주자 얼마만큼? -800만큼 인데
                        money -= list.get(3).price;
                        txt_main.setText(money + "");
                        //갯수빼주고
                        list.get(3).cnt--;
                        txt_hc.setText(list.get(3).cnt + "개 남음");
                        //버튼 누른 횟수로 내가 구매한 갯수 파악
                        list.get(3).count++;


                    } else {
                        Toast.makeText(MainActivity.this, "품절 입니다.", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        //랜덤 눌렀을때
        btn_rn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(money < list.get(4).price){
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();
                }else{

                    if(list.get(4).cnt > 0) {
                        //금액차감
                        money -= list.get(4).price;
                        //상품갯수 빼기
                        list.get(4).cnt--;

                        //차감금액 띄우기
                        txt_main.setText("금액" + money + "원");


                        //버튼 누른 횟수
                        list.get(4).count++;

                        //현재 남은 갯수
                        txt_rn.setText(list.get(4).cnt + "개 남음");

                    }else{
                        Toast.makeText(MainActivity.this, "품절 되었습니다", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });


        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("list", list);
                intent.putExtra("money", money);

                startActivity(intent);

            }
        });
    }


}
