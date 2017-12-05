package com.example.a207_1.mylibrary;

/**
 * Created by 207-1 on 05/12/2017.
 */

public class Members{
    private String id_members;
    private Pinjaman pinjaman;


    private String[][] data = new String[][]{
            {"000001"},
            {"000002"},
            {"000003"},
            {"000004"}
    };

    public String getId_members() {
        return id_members;
    }

    public void setId_members(String id_members) {
        this.id_members = id_members;
    }
}
