import java.util.Scanner;
public class PerpustakaanMain {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Perpustakaan[] arrayBuku = new Perpustakaan[3];
        for(int i = 0; i< 3; i++){
            arrayBuku[i] = new Perpustakaan();
            System.out.println("masukan judul");
            arrayBuku[i].judul = sc.next();
            sc.nextLine();
            System.out.println("pengarang : ");
            arrayBuku[i].pengarang = sc.next();
            sc.nextLine();
            System.out.println("Harga : ");
            arrayBuku[i].harga = sc.nextInt();
        }
        System.out.println("==== DATA BUKU =====");
        for(int i = 0; i < 3; i++){
            arrayBuku[i].info();
        }
    }
}
