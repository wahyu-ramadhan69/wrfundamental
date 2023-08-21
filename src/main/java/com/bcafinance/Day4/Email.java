package com.bcafinance.Day4;

import java.util.Random;

public class Email {
    public static void main(String[] args) {
        Random random = new Random();

        String data = "";

        String[] domains = { "@gmail.com", "@yahoo.com", "@outlook.com", "@hotmail.com" };

        for (int a = 0; a < 10; a++) {

            int jumlah = random.nextInt(15, 20);
            int angka = random.nextInt(1, 99);
            int hasil = random.nextInt(0, 4);

            for (int i = 0; i < jumlah; i++) {
                int text = random.nextInt(97, 122);
                Character email = (char) text;
                data += email;
            }
            String akhir = data + angka + domains[hasil];
            System.out.println(akhir);
            data = "";
        }
    }
}
