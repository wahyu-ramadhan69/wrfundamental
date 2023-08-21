package com.bcafinance.Day4;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strInput = "";
        System.out.print("Masukkan 1 kata : ");
        strInput = sc.nextLine();

        /*
         * Mangga
         * Kodok
         */

        char[] chinput = strInput.toCharArray();
        /*
         * {'K','o','d','O','k'}
         */
        int intLen = chinput.length;
        String strTemp = "";
        for (int i = intLen - 1; i >= 0; i--) {
            strTemp += chinput[i];
        }
        if (strInput.equalsIgnoreCase(strTemp)) {
            System.out.println("Ini adalah Palindrom");
        } else {
            System.out.println("Bukan Palindrom !!");
        }
        sc.close();
    }
}
