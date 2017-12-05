package com.example.a207_1.mylibrary;

/**
 * Created by 207-1 on 05/12/2017.
 */

public class Users {
    private String email;
    private String password;
    private String namalengkap;
    private String telepon;

    private String[][] data = new String[][]{
            {"kenny_16@kharisma.ac.id","kennyivan","Kenny Ivan","867984"},
            {"billy_16@kharisma.ac.id","billytanyawan","Billy Tanyawan","867902"},
            {"ivan_16@kharisma.ac.id","ivandarmawan","Ivan Darmawan","867945"},
            {"yanoris_16@kharisma.ac.id","yanorisarnold","Yanoris Arnold","867999"}
    };



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamalengkap() {
        return namalengkap;
    }

    public void setNamalengkap(String namalengkap) {
        this.namalengkap = namalengkap;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }


}
