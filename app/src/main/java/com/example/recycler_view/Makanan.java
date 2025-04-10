package com.example.recycler_view;

public class Makanan {
    private String NamaMakanan;
    private String Deskripsi;
    private String HargaMakanan;
    private int imagemakanan;


    public Makanan(String NamaMakanan , String Deskripsi, String HargaMakanan, int imagemakanan ) {
        this.NamaMakanan = NamaMakanan;
        this.Deskripsi = Deskripsi;
        this.HargaMakanan = HargaMakanan;
        this.imagemakanan = imagemakanan;
    }

    public String getNama() {
        return NamaMakanan;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public String getHargaMakanan() {
        return HargaMakanan;
    }


    public int getImagemakanan() {
        return imagemakanan;
    }
}


