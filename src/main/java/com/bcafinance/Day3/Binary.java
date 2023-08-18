package com.bcafinance.Day3;

public class Binary {
    public static void main(String[] args) {
        // int keyword = 88;
        // int[] val = { 66, 77, 80, 84, 88, 99, 100, 105, 111, 114, 119, 130, 136, 140
        // };// DATA GANJIL
        // int low = 0;
        // int high = val.length - 1;
        // int med = 0;
        // boolean status = false;

        // while (low <= high) {
        // med = (low + high) / 2;
        // if (keyword == val[med]) {
        // System.out.println(keyword + " FOUNDED in position " + (med + 1) + " and
        // INDEX " + med);
        // status = true;
        // break;
        // } else {
        // if (keyword > val[med]) {
        // low = med + 1;

        // } else {
        // high = med - 1;
        // }
        // }
        // } // END OF WHILE PROCESS

        // // IF DATA NOT FOUND
        // if (!status) {
        // System.out.println(keyword + " NOT FOUND !!");
        // }
        int penghasilan = 10;
        if (penghasilan < 5000000000l) {

            System.out.println("Tarif 35 %");

        } else {

            if (penghasilan < 500000000) {

                System.out.println("Tarif 30 %");

            } else {

                if (penghasilan < 250000000) {

                    System.out.println("Tarif 25 %");

                } else {

                    if (penghasilan < 60000000) {

                        System.out.println("Tarif 15%");

                    } else {

                        System.out.println("Tarif 5%");

                    }

                }

            }

        }

        if (penghasilan < 5000000000l) {

            System.out.println("Tarif 35 %");

        } else {

            if (penghasilan < 500000000) {

                System.out.println("Tarif 30 %");

            } else {

                if (penghasilan < 250000000) {

                    System.out.println("Tarif 25 %");

                } else {

                    if (penghasilan < 60000000) {

                        System.out.println("Tarif 15%");

                    } else {

                        System.out.println("Tarif 5%");

                    }

                }

            }

        }
    }

}
