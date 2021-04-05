package com.example.recyclelistview;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String nohp;

    public Mahasiswa(String nama, String nim, String nohp) {
        this.nama = nama;
        this.nim = nim;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public String getNohp() {
        return nohp;
    }

    public void setnohp(String nohp) {
        this.nohp = nohp;
    }
}

