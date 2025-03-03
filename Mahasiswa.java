public class Mahasiswa {
    public Mahasiswa( String nama, String jurusan, int nim){
        this.nama = nama;
        this.jurusan = jurusan;
        this.nim = nim;

    }

    String nama, jurusan;
    int nim;

    void info(){
        System.out.println("NAMA MAHASISWA : " + nama);
        System.out.println("NIM MAHASISWA : " + nim);
        System.out.println("JURUSAN MAHASISWA : " + jurusan);
        System.out.println();
    }
}