package com.nurulfaisol.e_found;

public class Barang {
    private int Id;
    private String NamaBarang,Deskripsi;

    public Barang(int id, String namaBarang, String deskripsi) {
        Id = id;
        NamaBarang = namaBarang;
        Deskripsi = deskripsi;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        NamaBarang = namaBarang;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }
}
