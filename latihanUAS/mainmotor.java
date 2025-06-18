
import java.util.Scanner;

public class mainmotor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang di program antrian kendaraan");
        System.out.println("Masukan kapasitas antrian: ");
        int max = sc.nextInt(); sc.nextLine();
        linklistmotor antrian = new linklistmotor(max);
        int pilihan;

        do {
            System.out.println("== MENU ==");
            System.out.println("1. masukan motor ke antrian");
            System.out.println("2. layani motor di antrian paling depan");
            System.out.println("3. liat jumlah antrian");
            System.out.println("4. tampilkan semua informasi motor yang ada di antrian");
            System.out.println("5. kosongkan antrian");
            System.out.println("masukan pilihan anda:");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("masukan merk motor");
                    String merk = sc.nextLine();
                    System.out.println("masukan plat motor:");
                    String plat = sc.nextLine();
                    motor mtr = new motor(merk, plat);
                    antrian.enqueue(mtr);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.jumlahAntrian();
                    break;
                case 4:
                    antrian.tampilSemua();
                    break;
                case 5:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terimakasih, program selesai ...");
                    System.exit(0);
                default:
                    break;
            }
        } while (pilihan != 0);
    }
}
