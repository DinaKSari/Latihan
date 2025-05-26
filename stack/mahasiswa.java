package stack;
public class mahasiswa {
    String nama, nim;
    double ipk;

    mahasiswa(String nama, String nim, double ipk){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    void infoMhs(){
        System.out.println(nama + " | " + nim+ " | " + ipk);
    }
}
