import java.util.Scanner;
public class MobilMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobil[] mobil1 = new Mobil[3];
        for(int i = 0; i< 3; i++){
            mobil1[i] = new Mobil();
            System.out.println("masukan merk:");
            mobil1[i].merk = sc.next();
            System.out.println("model:");
            mobil1[i].model = sc.next();
            System.out.println("Masukan tahun:");
            mobil1[i].thn = sc.nextInt();
        }
        
        for(int i =  0; i<3;i++){
            mobil1[i].info();
            mobil1[i].hitungTahun(mobil1[i].thn);
        }
    }
}
