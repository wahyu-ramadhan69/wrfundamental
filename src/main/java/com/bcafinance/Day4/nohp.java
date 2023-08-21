package com.bcafinance.Day4;

import java.util.Random;

public class nohp {
    public static void main(String[] args) {
        Random random = new Random();

        String pertama = "08";
        String[] provider = { "23", "21", "52", "97", "57", "12" };

        for (int i = 0; i < 10; i++) {
            StringBuilder kedua = new StringBuilder();
            int a = random.nextInt(0, 5);
            int b = random.nextInt(10, 13);
            for (int j = 0; j < b; j++) {
                int nomer = random.nextInt(10);
                kedua.append(nomer);
            }

            String hasil = pertama + provider[a] + kedua;
            System.out.println(hasil);
            kedua.setLength(0);
        }
    }

}
