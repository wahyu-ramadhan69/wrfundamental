package com.bcafinance.Day4;

public class Segitiga {

    public static void main(String[] args) {
        LuasSegitiga(4, 6);

        Subs("hello world");

        String data = "kuda";

        char[] dataArr = data.toCharArray();

        System.out.println(dataArr);
    }

    private static void LuasSegitiga(int alas, int tinggi) {
        double luas = 0.5 * alas * tinggi;
        System.out.println(luas);
    }

    private static void Subs(String data) {
        System.out.println(data.substring(6));
    }
}
