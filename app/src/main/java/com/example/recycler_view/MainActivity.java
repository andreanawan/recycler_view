package com.example.recycler_view;

import
        android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MakananAdapter.OnItemClickListener{
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Makanan> Makanan = new ArrayList<>();
        Makanan.add(new Makanan("Rendang", "masakan padang yang lezat", "15.000", R.drawable.rendang));
        Makanan.add(new Makanan("Nasi Goreng", "enakoo", "12.000", R.drawable.nasigoreng));
        Makanan.add(new Makanan("Bakso", "segar dimakan saat udara dingin", "7.000", R.drawable.bakso));
        Makanan.add(new Makanan("ayam geprek", "ayam pedas", "10.000", R.drawable.ayamgeprek));
        Makanan.add(new Makanan("ayam geprek", "ayam pedas", "10.000", R.drawable.ayamgeprek));

        MakananAdapter MakananAdapter = new MakananAdapter(Makanan,this);
        recyclerView.setAdapter(MakananAdapter);
    }

    @Override
    public void onItemClick(Makanan Makanan) {
        Toast.makeText(this,  Makanan.getNama() + "," + Makanan.getHargaMakanan(),Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,DetailMakanan.class);
        intent.putExtra("namaMakanan",Makanan.getNama());
        intent.putExtra("gambarMakanan", Makanan.getImagemakanan());
        intent.putExtra("hargaMakanan", Makanan.getHargaMakanan());
        intent.putExtra("Deskripsi", Makanan.getDeskripsi());
        startActivity(intent);

    }
}