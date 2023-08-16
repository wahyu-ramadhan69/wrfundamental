package com.bcafinance;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // System.out.print("Masukkan username : ");
                // String user = sc.nextLine();

                // System.out.print("masukkan password : ");
                // String password = sc.nextLine();

                // if (user.equals("wahyu") && password.equals("1234")) {
                // System.out.println("benar");
                // } else if (!user.equals("wahyu")) {
                // System.out.println("akun tidak terdaftar");
                // } else if (!password.equals("1234")) {
                // System.out.println("password salah");
                // }

                // String strCase = "jumat";
                // switch (strCase) {
                // case "senin":
                // System.out.println("hari senin");
                // System.out.println("ke pasar");
                // break;
                // case "selasa":
                // System.out.println("hari selasa");
                // System.out.println("ke kantor");
                // break;
                // case "rabu":
                // System.out.println("hari rabu");
                // System.out.println("ke keun binatang");
                // break;
                // case "jumat":
                // System.out.println("hari jumat");
                // System.out.println("ke mana");
                // break;
                // default:
                // System.out.println("hanya rencara");
                // }

                String data[] = new String[10];
                int size = 0;

                boolean infiniteLoop = true;
                while (infiniteLoop) {
                        System.out.println("++++==== Progam Pencatat Mobil =====++++");
                        System.out.println("1. input data");
                        System.out.println("2. tampilkan data.");
                        System.out.println("3. ubah data.");
                        System.out.println("4. hapus data.");
                        System.out.println("5. udahan.\n");

                        System.out.print("masukkan pilihan :");
                        int pilih = sc.nextInt();
                        switch (pilih) {
                                case 1:
                                        if (size < data.length) {
                                                System.out.println("masukkab data baru");
                                                String newData = sc.next();
                                                data[size] = newData;
                                                size++;
                                        } else {
                                                System.out.println("data penuh");
                                        }
                                        break;
                                case 2:
                                        System.out.println("Data saat ini");
                                        for (int i = 0; i < size; i++) {
                                                System.out.println(i + ". " + data[i]);
                                        }
                                        break;
                                case 3:
                                        System.out.print("Masukkan indeks data yang ingin diubah: ");
                                        int updateIndex = sc.nextInt();
                                        if (updateIndex >= 0 && updateIndex < size) {
                                                System.out.print("Masukkan data baru: ");
                                                String updatedData = sc.next();
                                                data[updateIndex] = updatedData;
                                                System.out.println("Data berhasil diubah.");
                                        } else {
                                                System.out.println("Indeks tidak valid.");
                                        }
                                        break;
                                case 4:
                                        System.out.print("Masukkan indeks data yang ingin dihapus: ");
                                        int deleteIndex = sc.nextInt();
                                        if (deleteIndex >= 0 && deleteIndex < size) {
                                                for (int i = deleteIndex; i < size - 1; i++) {
                                                        data[i] = data[i + 1];
                                                }
                                                size--;
                                                System.out.println("Data berhasil dihapus.");
                                        } else {
                                                System.out.println("Indeks tidak valid.");
                                        }
                                        break;
                                case 5:
                                        infiniteLoop = false;
                                        break;
                                default:
                                        System.out.println("kamu memasukkan inputan yang salah\n");
                                        break;
                        }

                }
                System.out.println("udahan dulu yaa....");
                sc.close();
        }
}
// substring untuk mengambil karakter

// trim untuk menghilangkan spasi
