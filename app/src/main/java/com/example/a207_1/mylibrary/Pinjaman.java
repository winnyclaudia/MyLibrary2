package com.example.a207_1.mylibrary;

/**
 * Created by 207-1 on 05/12/2017.
 */

public class Pinjaman {
    private String tanggalpinjam;
    private String tanggalkembali;
    private Members id_members;
    private Buku buku;

    private String[][] data = new String[][]{
            {"01 Desember 2017","08 Desember 2017"},
            {"02 Desember 2017","09 Desember 2017"},
            {"03 Desember 2017","10 Desember 2017"},
            {"04 Desember 2017","11 Desember 2017"}
    };


    public String getTanggalpinjam() {
        return tanggalpinjam;
    }

    public void setTanggalpinjam(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembali() {
        return tanggalkembali;
    }

    public void setTanggalkembali(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    public Members getId_members() {
        return id_members;
    }

    public void setId_members(Members id_members) {
        this.id_members = id_members;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

}
