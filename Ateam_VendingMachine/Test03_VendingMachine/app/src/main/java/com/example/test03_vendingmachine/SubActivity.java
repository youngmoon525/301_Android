package com.example.test03_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SubActivity extends AppCompatActivity {
    ImageView img_1, img_2, img_3, img_4, img_5, img_6, img_7, img_8;
    TextView qty_1, qty_2, qty_3, qty_4, qty_5, qty_6, qty_7, qty_8, blc, cost_total, pdt_1, pdt_2, pdt_3, pdt_4, pdt_5, pdt_6, pdt_7, pdt_8;
    LinearLayout layout_1, layout_2, layout_3, layout_4, layout_5, layout_6, layout_7, layout_8;
//    int aa = R.drawable.img1;

//    String c = "img1";
//    String bb = "R.drawble." + c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        qty_1 = findViewById(R.id.qty_1);
        qty_2 = findViewById(R.id.qty_2);
        qty_3 = findViewById(R.id.qty_3);
        qty_4 = findViewById(R.id.qty_4);
        qty_5 = findViewById(R.id.qty_5);
        qty_6 = findViewById(R.id.qty_6);
        qty_7 = findViewById(R.id.qty_7);
        qty_8 = findViewById(R.id.qty_8);

        pdt_1 = findViewById(R.id.pdt_1);
        pdt_2 = findViewById(R.id.pdt_2);
        pdt_3 = findViewById(R.id.pdt_3);
        pdt_4 = findViewById(R.id.pdt_4);
        pdt_5 = findViewById(R.id.pdt_5);
        pdt_6 = findViewById(R.id.pdt_6);
        pdt_7 = findViewById(R.id.pdt_7);
        pdt_8 = findViewById(R.id.pdt_8);

        img_1 = findViewById(R.id.img_1);
        img_2 = findViewById(R.id.img_2);
        img_3 = findViewById(R.id.img_3);
        img_4 = findViewById(R.id.img_4);
        img_5 = findViewById(R.id.img_5);
        img_6 = findViewById(R.id.img_6);
        img_7 = findViewById(R.id.img_7);
        img_8 = findViewById(R.id.img_8);

        layout_1 = findViewById(R.id.layout_1);
        layout_2 = findViewById(R.id.layout_2);
        layout_3 = findViewById(R.id.layout_3);
        layout_4 = findViewById(R.id.layout_4);
        layout_5 = findViewById(R.id.layout_5);
        layout_6 = findViewById(R.id.layout_6);
        layout_7 = findViewById(R.id.layout_7);
        layout_8 = findViewById(R.id.layout_8);

        blc = findViewById(R.id.blc);
        cost_total = findViewById(R.id.cost_total);

        Intent intent = getIntent();

       // VendingDTO dto= (VendingDTO) intent.getSerializableExtra("dto");
        ArrayList<VendingDTO> list = (ArrayList<VendingDTO>) intent.getSerializableExtra("list");

        LinearLayout[] layouts = {layout_1, layout_2, layout_3, layout_4, layout_5, layout_6, layout_7, layout_8};
        TextView[] tvs_qty = {qty_1, qty_2, qty_3, qty_4, qty_5, qty_6, qty_7, qty_8};
//        TextView[] tvs_pdt = {pdt_1, pdt_2, pdt_3, pdt_4, pdt_5, pdt_6, pdt_7, pdt_8};
        for (int i = 0; i < list.size(); i++) {
//            tvs_pdt[i].setText(list.get(i).getPdt_name());
            tvs_qty[i].setText(list.get(i).getQty()+"");
            if (list.get(i).getQty() == 0) {
                layouts[i].setVisibility(View.GONE);
            }
        }


        int cost_return = Integer.parseInt(intent.getStringExtra("blc"));
        int cost_total11 = Integer.parseInt(intent.getStringExtra("cost_total"));
       cost_total.setText(intent.getStringExtra("cost_total"));
       blc.setText(cost_return -cost_total11+"");



    }
}


//        btn_1 = findViewById(R.id.btn_1);
//
//        btn_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                img_1.setImageResource(R.drawable.img3);
//            }
//        });
