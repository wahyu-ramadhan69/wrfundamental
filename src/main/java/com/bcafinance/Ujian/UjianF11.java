package com.bcafinance.Ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianF11 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        String[] pertama = { "08", "628" };
        String[] provider = { "23", "21", "52", "97", "57", "12" };

        System.out.print("Jumlah data nomer handphone yang ingin di generate : ");
        int jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++) {
            int tigaDigit = random.nextInt(100, 1000);
            StringBuilder terakhir = new StringBuilder();

            int a = random.nextInt(0, 2);
            int b = random.nextInt(3, 6);
            int c = random.nextInt(3, 8);

            for (int k = 0; k < c; k++) {
                int nomer = random.nextInt(10);
                terakhir.append(nomer);
            }

            String hasil = pertama[a] + provider[b] + "-" + tigaDigit + "-" + terakhir;
            System.out.println(hasil);
            terakhir.setLength(0);
        }

    }

}
