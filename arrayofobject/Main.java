package arrayofobject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataBuku dt = new DataBuku();
        Scanner sc = new Scanner(System.in);
        System.out.println("masukan jumlah buku: ");
        int jum = sc.nextInt();
        for(int i=0; i<jum;i++){
            System.out.println("Masukan judul buku: ");
            String judul = sc.nextLine(); sc.nextLine();
            String penulis = sc.nextLine(); sc.nextLine();
            int tahun = sc.nextInt();
            Buku bk = new Buku(judul,penulis,tahun);
            dt.tambah(bk);
        }
        dt.tampilSemua();

        

    }
}
