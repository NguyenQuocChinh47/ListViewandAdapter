package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<TraiCay> traiCayArrayList;
    TraiCayAdapter traiCayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();

        traiCayAdapter = new TraiCayAdapter(this, R.layout.dong_traicay, traiCayArrayList);
        lvTraiCay.setAdapter(traiCayAdapter);

    }
    private void anhXa() {
        lvTraiCay = findViewById(R.id.lv_TraiCay);
        traiCayArrayList = new ArrayList<>();
        traiCayArrayList.add(new TraiCay("Oppo Reno3","Sản phẩm của Oppo", R.drawable.oppo));
        traiCayArrayList.add(new TraiCay("Realme C3","Sản phẩm của Realme", R.drawable.realme));
        traiCayArrayList.add(new TraiCay("Note 10+","Sản phẩm của SamSung", R.drawable.samsung));
        traiCayArrayList.add(new TraiCay("Redmi Note 8 Pro","Sản phẩm c Xiaomi", R.drawable.xiaomi));
    }

}