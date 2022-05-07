package com.example.lotoliveshow;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView nTvloto;
    TextView nTveaseout;
    String nTveaseInout;
    Button mBtLai;
    int mBtRao;
    Random mBtRandom;
    private View view;
    int ddContentView;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nTveaseout = findViewById(R.id.easeOut);
        nTveaseInout = findViewById(R.id.easeInOut);
        nTvloto = findViewById(R.id.Loto);


//            List<String> DS = new ArrayList();
//            //Thêm
//DS.add("A");
//DS.add("B");
//DS.add("c");
//// xóa
//        DS.remove(0);
//        //cap nhật
//        DS.set(0, String.valueOf(DS));
        ArrayList<Integer> mArrNumbers = new ArrayList<>();
        mBtRandom = new Random();
        // Thêm sô vào mảng
        for (int i = 0; i < 100; i++) {
            mArrNumbers.add(i);
        }
        // Unit case
        // Case 1: Các giá trị không được trùng
        // Case 2: Nếu như hết số random thì thông báo
        //Case 3: Hiển thị không bị dư dấu
        // Case 4: Button reset lại
        mBtLai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mArrNumbers.size() > 0) {
                    int index = mBtRandom.nextInt();
                    int value = mArrNumbers.get(index);
                    nTveaseout.setText(value + "");
                    if (mArrNumbers.size() == 100) {
                        mBtRao += value;
                    } else {
                        mBtRao = value;
                    }
                    nTveaseInout = value + "-" + nTveaseInout;
                } else {
                    Toast.makeText(MainActivity.this, "Trò chơi kết thúc", Toast.LENGTH_SHORT).show();
                }
            }
        }); {
        } ;
        mBtLai.setOnClickListener(View.OnClickListener); {
            @Override
                    public void onClick(View view){
                mArrNumbers.clear();
        }
        addContentView();
            nTveaseInout = "";
            nTveaseout.setText("");
            nTvloto.setText("");
    }
    }
}
//        Random random = new Random();
//        int value = random.nextInt(max - min +1) + min;
//        for (int i = 0; i < 100; i++) {
//            Log.d("BBB", "");