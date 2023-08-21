package com.bcafinance.Ujian;

import java.util.Random;
import java.util.Scanner;

public class UjianF12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        String data = "";
        String data2 = "";

        String[] provider = { "@gmail", "@ymail", "@ymail", "@rocketmail" };
        String[] domains = { "co.id", "id" };

        System.out.print("Jumlah data format email yang ingin di generate : ");
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {

            int a = random.nextInt(0, 3);

            if (a == 0) {
                int angka = random.nextInt(1, 999);
                int jumlah = random.nextInt(10, 15);

                for (int j = 0; j < jumlah; j++) {
                    int text = random.nextInt(97, 122);
                    Character email = (char) text;
                    data += email;
                }
                String akhir = angka + data + provider[random.nextInt(0, 4)] + "." + domains[random.nextInt(0, 2)];
                System.out.println(akhir);
                data = "";
            } else if (a == 1) {
                int angka = random.nextInt(1, 999);
                int jumlah = random.nextInt(10, 15);

                int pembagi = jumlah / 2;
                System.out.println(pembagi);

                for (int j = 0; j < pembagi; j++) {
                    int text = random.nextInt(97, 122);
                    Character email = (char) text;
                    data += email;
                }

                for (int j = 0; j < pembagi; j++) {
                    int text = random.nextInt(97, 122);
                    Character email = (char) text;
                    data2 += email;
                }

                String akhir = data + angka + data2 + provider[random.nextInt(0, 4)] + "."
                        + domains[random.nextInt(0, 2)];
                System.out.println(akhir);
                pembagi = 0;
                data = "";
            } else if (a == 2) {
                int angka = random.nextInt(1, 999);
                int jumlah = random.nextInt(10, 15);

                for (int j = 0; j < jumlah; j++) {
                    int text = random.nextInt(97, 122);
                    Character email = (char) text;
                    data += email;
                }
                String akhir = data + angka + provider[random.nextInt(0, 4)] + "." + domains[random.nextInt(0, 2)];
                System.out.println(akhir);
                data = "";
            }
        }
    }
}
