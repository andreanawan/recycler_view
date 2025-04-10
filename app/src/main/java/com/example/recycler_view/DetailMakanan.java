package com.example.recycler_view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailMakanan extends AppCompatActivity {

    TextView tvNamaMakananDetail;
    ImageView imgmakanan;
    TextView tvhargaMakanan;
    TextView tvdeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_makanan);

        tvNamaMakananDetail = findViewById(R.id.tvNamaMakananDetail);
        imgmakanan = findViewById(R.id.imgmakanan);
        tvhargaMakanan = findViewById(R.id.tvhargaMakanan);
        tvdeskripsi = findViewById(R.id.tvdeskripsi);
        Intent intent = getIntent();
        String namaMakanan = intent.getStringExtra("namaMakanan");
        Integer gambarMakanan = intent.getIntExtra("gambarMakanan",0);
        String hargaMakanan = intent.getStringExtra("hargaMakanan");
        String Deskripsi = intent.getStringExtra("Deskripsi");
        tvNamaMakananDetail.setText(namaMakanan);
        imgmakanan.setImageResource(gambarMakanan);
        tvhargaMakanan.setText(hargaMakanan);
        tvdeskripsi.setText(Deskripsi);

    }
}