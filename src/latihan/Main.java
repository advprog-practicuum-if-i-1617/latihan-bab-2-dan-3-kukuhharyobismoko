/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author kukuh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("1.Angka -> Huruf");
            System.out.println("2.Huruf -> Angka");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            if (pilih == 1) {
                System.out.print("Masukkan angka : ");
                int angka = sc.nextInt();
                System.out.println(Convert.change(angka));
            } else if (pilih == 2) {
                System.out.print("Masukkan huruf : ");
                String huruf = sc.nextLine();
                huruf = sc.nextLine();
                System.out.println(Convert.change(huruf));
            }
        } while (pilih != 0);
    }
}
