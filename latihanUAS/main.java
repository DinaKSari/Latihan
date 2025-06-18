package latihanUAS;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan maksimum kapasitas: ");
        int max = sc.nextInt();
        doublelinklists antrian = new doublelinklists(max);
        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. tambah antrian");
            System.out.println("2. layani antrian");
            System.out.println("3. liat semua yang ada di anrian");
            System.out.println("masukan pilhan: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("masukan merk");
                    String merk = sc.nextLine();
                    System.out.println("masukan plat");
                    String plat = sc.nextLine();
                    System.out.println("masukan tahun dibuat");
                    int tahun = sc.nextInt();
                    System.out.println("masukan stok nya");
                    int stok = sc.nextInt();
                    car c1 = new car(merk, plat, tahun, stok);
                    antrian.tambah(c1);
                    break;
                case 2:
                    antrian.kurang();
                    break;

                case 3:
                    antrian.tampilSemua();
                    break;
                default:
                    break;
            }
            
        } while (pilihan != 0);
    }
}
