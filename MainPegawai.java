import java.util.Scanner;

public class MainPegawai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pegawai[] arrayOfPegawai = new Pegawai[3];
        for(int i=0;i<3;i++){
            arrayOfPegawai[i] = new Pegawai();
            System.out.println("masukan nama : ");
            arrayOfPegawai[i].nama = sc.next();
            System.out.println("masukan id pegawai: ");
            arrayOfPegawai[i].id = sc.nextInt();
            System.out.println("masukan gaji pegawai: ");
            arrayOfPegawai[i].gaji = sc.nextInt();
        }
    }
}
