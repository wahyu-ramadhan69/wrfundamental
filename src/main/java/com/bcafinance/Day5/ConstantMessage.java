package com.bcafinance.Day5;

public class ConstantMessage {
    public static final String NAMA_LENGKAP = "barudak well";

    private String username;
    private String password;

    public static String getNamaLengkap() {
        return NAMA_LENGKAP;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
