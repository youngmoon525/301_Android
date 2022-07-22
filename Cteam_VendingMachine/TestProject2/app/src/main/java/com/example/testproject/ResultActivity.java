package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class ResultActivity extends AppCompatActivity {
    TextView tv_sub, tv_sub1, tv_sub2, tv_sub3, tv_sub4, tv_sub5;
    ImageView img_shin, img_jin, img_yeol, img_hc, img_ran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tv_sub = findViewById(R.id.tv_sub);
        tv_sub1 = findViewById(R.id.tv_sub1);
        tv_sub2 = findViewById(R.id.tv_sub2);
        tv_sub3 = findViewById(R.id.tv_sub3);
        tv_sub4 = findViewById(R.id.tv_sub4);
        tv_sub5 = findViewById(R.id.tv_sub5);

        img_shin = findViewById(R.id.img_shin);
        img_jin = findViewById(R.id.img_jin);
        img_yeol = findViewById(R.id.img_yeol);
        img_hc = findViewById(R.id.img_hc);
        img_ran = findViewById(R.id.img_ran);

        Intent intent = getIntent(); // intent 받아주기
        ArrayList<RamenDTO> list = ( ArrayList<RamenDTO> )intent.getSerializableExtra("list");
        int money = intent.getIntExtra("money", -1);


        tv_sub.setText( "잔액 : "+ money + "원");
         imgvGone();
         tvGone();


         //신라면
        if(list.get(0).count > 0){
             tv_sub1.setText(list.get(0).name + " : " + list.get(0).count + "개");
             tv_sub1.setVisibility(View.VISIBLE);
             img_shin.setVisibility(View.VISIBLE);
        }else {
            tv_sub1.setText("");

        }


        //진순이
        if(list.get(1).count > 0){
             tv_sub2.setText(list.get(1).name + " : " + list.get(1).count + "개");
            tv_sub2.setVisibility(View.VISIBLE);
             img_jin.setVisibility(View.VISIBLE);
        }else {
            tv_sub2.setText("");
        }


        //열라면
        if(list.get(2).count > 0){
             tv_sub3.setText(list.get(2).name + " : " + list.get(2).count + "개");
            tv_sub3.setVisibility(View.VISIBLE);
             img_yeol.setVisibility(View.VISIBLE);
        }else {
            tv_sub3.setText("");
        }


        //불닭
        if(list.get(3).count > 0){
             tv_sub4.setText(list.get(3).name + " : " + list.get(3).count + "개");
             tv_sub4.setVisibility(View.VISIBLE);
             img_hc.setVisibility(View.VISIBLE);
        }else {
            tv_sub4.setText("");
        }
        
        //랜덤
        if(list.get(4).count > 0){
            Random random = new Random();
            int ran = random.nextInt(4);
            tv_sub5.setText("(랜덤) "+list.get(ran).name + " : 1개");
            tv_sub5.setVisibility(View.VISIBLE);
            img_ran.setVisibility(View.VISIBLE);
        }else {
            tv_sub5.setText("");
        }









    }

    //이미지뷰 하나 뺴먹음.
    public void tvGone() {
        tv_sub1.setVisibility(View.GONE);
        tv_sub2.setVisibility(View.GONE);
        tv_sub3.setVisibility(View.GONE);
        tv_sub4.setVisibility(View.GONE);
    }

    public void imgvGone() {
        img_shin.setVisibility(View.GONE);
        img_jin.setVisibility(View.GONE);
        img_yeol.setVisibility(View.GONE);
        img_hc.setVisibility(View.GONE);
    }


}