package com.bcafinance.Day3;

import java.util.Scanner;

public class Asci {

    public static void main(String[] args) {

        System.out.println("******Progam penerjemah Ascii*******\n");
        Scanner sc = new Scanner(System.in);
        String a = "a123a";
        System.out.println(a.toCharArray());
        int JumlahAsci = 0;
        int b;
        System.out.print("Masukkan data yang akan diterjemahkan : ");
        a = sc.nextLine();
        char[] chArr = a.toCharArray();
        for (int i = 0; i < chArr.length; i++) {
            b = chArr[i];
            if ((b >= 65 && b <= 90) || (b >= 97 && b <= 122)) {
                JumlahAsci += b;
            }
        }
        System.out.println(JumlahAsci);
        sc.close();

    }
}
