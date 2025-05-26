package arrayofobject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBuku dt = new DataBuku();
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan jumlah buku: ");
        int jum = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<jum;i++){
            System.out.println("Masukan judul buku: ");
            String judul = sc.nextLine(); 
            System.out.println("Masukan nama penulis: ");
            String penulis = sc.nextLine(); 
            System.out.println("Masukan tahun terbit buku: ");
            int tahun = sc.nextInt();
            sc.nextLine();
            Buku bk = new Buku(judul,penulis,tahun);
            dt.tambah(bk);
        }
        dt.tampilSemua();
        dt.findByThn(2022);

        

    }
}
