package queue;

public class pelanggan {
    String nama;
    int nomor;

    public pelanggan(String nama, int nomor){
        this.nama = nama;
        this.nomor = nomor;
    }

    public void infoPelanggan(){
        System.out.println(" | " + nama + " | " + nomor);
    }
}
