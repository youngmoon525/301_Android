package com.example.test03_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    EditText m_1;
    LinearLayout layout1_1,layout1_2,layout1_3,layout1_4,layout1_5,layout1_6,layout1_7,layout1_8;

    TextView cost_total, blc, qty_1, qty_2, qty_3, qty_4, qty_5, qty_6, qty_7, qty_8, cost_1, cost_2, cost_3, cost_4, cost_5, cost_6, cost_7, cost_8;
    ImageView img_1, img_2, img_3, img_4, img_5, img_6, img_7, img_8, img_1_1, img_1_2, img_1_3, img_1_4, img_1_5, img_1_6, img_1_7, img_1_8;
    int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0, cnt7 = 0, cnt8 = 0;
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10;       //9번은 금액입력 , 10번은 주문하기



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //버튼생성
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_10 = findViewById(R.id.btn_10);

        //수량
        qty_1 = findViewById(R.id.qty_1);
        qty_2 = findViewById(R.id.qty_2);
        qty_3 = findViewById(R.id.qty_3);
        qty_4 = findViewById(R.id.qty_4);
        qty_5 = findViewById(R.id.qty_5);
        qty_6 = findViewById(R.id.qty_6);
        qty_7 = findViewById(R.id.qty_7);
        qty_8 = findViewById(R.id.qty_8);

        //스크롤뷰 이미지
        img_1_1 = findViewById(R.id.img_1_1);
        img_1_2 = findViewById(R.id.img_1_2);
        img_1_3 = findViewById(R.id.img_1_3);
        img_1_4 = findViewById(R.id.img_1_4);
        img_1_5 = findViewById(R.id.img_1_5);
        img_1_6 = findViewById(R.id.img_1_6);
        img_1_7 = findViewById(R.id.img_1_7);
        img_1_8 = findViewById(R.id.img_1_8);

        //우측레이아웃

        layout1_1 = findViewById(R.id.layout_1_1);
        layout1_2 = findViewById(R.id.layout_1_2);
        layout1_3 = findViewById(R.id.layout_1_3);
        layout1_4 = findViewById(R.id.layout_1_4);
        layout1_5 = findViewById(R.id.layout_1_5);
        layout1_6 = findViewById(R.id.layout_1_6);
        layout1_7 = findViewById(R.id.layout_1_7);
        layout1_8 = findViewById(R.id.layout_1_8);

        //입력금액 : 총입력금액 blc에 더해져야한다.
        m_1 = findViewById(R.id.m_1);

        //총입력금액
        blc = findViewById(R.id.blc);

        //총 구매금액(cost_total) : 각각의 ost * qty
        cost_total = findViewById(R.id.cost_total);


        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int qty = Integer.parseInt(qty_1.getText().toString());
                if (qty > 0) {
                    qty_1.setText(qty - 1 + "");
                    cnt1 += 1;
                    cost_total.setText(800 + cost_total1 + "");
                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_1.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_1.setText("품절");
                }

                layout1_1.setVisibility(View.VISIBLE);

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int num = Integer.parseInt(qty_2.getText().toString());
                if (num > 0) {
                    qty_2.setText(num - 1 + "");
                    cnt2 += 1;
                    cost_total.setText(1500 + cost_total1 + "");
                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_2.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_2.setText("품절");
                }

                layout1_2.setVisibility(View.VISIBLE);

            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int num = Integer.parseInt(qty_3.getText().toString());
                if (num > 0) {
                    qty_3.setText(num - 1 + "");
                    cnt3 += 1;
                    cost_total.setText(800 + cost_total1 + "");
                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_3.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_3.setText("품절");
                }

                layout1_3.setVisibility(View.VISIBLE);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int num = Integer.parseInt(qty_4.getText().toString());
                if (num > 0) {
                    qty_4.setText(num - 1 + "");
                    cnt4 += 1;
                    cost_total.setText(700 + cost_total1 + "");
                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_4.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_4.setText("품절");
                }

                layout1_4.setVisibility(View.VISIBLE);

            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int num = Integer.parseInt(qty_5.getText().toString());
                if (num > 0) {
                    qty_5.setText(num - 1 + "");
                    cnt5 += 1;
                    cost_total.setText(800 + cost_total1 + "");
                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_5.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_5.setText("품절");
                }

                layout1_5.setVisibility(View.VISIBLE);
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int num = Integer.parseInt(qty_6.getText().toString());
                if (num > 0) {
                    qty_6.setText(num - 1 + "");
                    cnt6 += 1;
                    cost_total.setText(800 + cost_total1 + "");

                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_6.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_6.setText("품절");
                }

                layout1_6.setVisibility(View.VISIBLE);
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int num = Integer.parseInt(qty_7.getText().toString());
                if (num > 0) {
                    qty_7.setText(num - 1 + "");
                    cnt7 += 1;
                    cost_total.setText(1300 + cost_total1 + "");

                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_7.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_7.setText("품절");
                }

                layout1_7.setVisibility(View.VISIBLE);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cost_total1 = Integer.parseInt(String.valueOf(cost_total.getText()));
                int num = Integer.parseInt(qty_8.getText().toString());
                if (num > 0) {
                    qty_8.setText(num - 1 + "");
                    cnt8 += 1;
                    cost_total.setText(1000 + cost_total1 + "");
                } else {
                    Toast.makeText(MainActivity.this, "재고가 부족합니다", Toast.LENGTH_SHORT).show();
                    btn_8.setBackgroundColor(Color.parseColor("#FFE4E4E4"));
                    btn_8.setText("품절");
                }
                layout1_8.setVisibility(View.VISIBLE);
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    int num = Integer.parseInt(m_1.getText().toString());
                    blc.setText(Integer.parseInt(blc.getText().toString()) + num + "");

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "금액을 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                int blc1 = Integer.parseInt(blc.getText().toString());
                int cost_total1 = Integer.parseInt(cost_total.getText().toString());
                ArrayList<VendingDTO> list = new ArrayList<>();

                String[] strs = {"음료1", "음료2", "음료3", "음료4", "음료5", "음료6", "음료7", "음료8"};
                int[] cnts = {cnt1, cnt2, cnt3, cnt4, cnt5, cnt6, cnt7, cnt8};

                if (blc1 >= cost_total1) {
                    //음료 리스트
                    for (int i = 0; i < 8; i++) {
                        list.add(new VendingDTO(strs[i], cnts[i]));
                    }

                    intent.putExtra("list", list);
                    intent.putExtra("blc", blc.getText().toString());
                    intent.putExtra("cost_total", cost_total.getText().toString());

                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "잔액이 부족합니다", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}