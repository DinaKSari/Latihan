package stack;
import java.util.Scanner;

public class StackMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan jumlah mahasiswa: ");
        int jum = sc.nextInt(); sc.nextLine();
        stack stc = new stack(jum);
        int pilihan;
        
        do { 
            System.out.println("MENU");
            System.out.println("1. masukan data");
            System.out.println("2. hapus data");
            System.out.println("3. melihat antrian paling depan");
            System.out.println("4. melihat semua yang di antrian");
            System.out.println("Pilihan: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukan nama mahasiswa:");
                    String nama = sc.nextLine();
                    System.out.println("masukan nim mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.println("masukan ipk mahasiswa: ");
                    double ipk = sc.nextDouble();
                    mahasiswa mhs = new mahasiswa(nama, nim, ipk);
                    stc.push(mhs);
                    break;
                case 2:
                    stc.pop();
                    break;
                case 3:
                    stc.peek().infoMhs();
                    break;
                case 4:
                    stc.tampilSemua();
                    break;
                default:
                    throw new AssertionError();
                case 0:
                    System.exit(0);
            }
        } while (pilihan >= 1 && pilihan <= 4);
    }
}