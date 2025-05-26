package arrayofobject;

public class Buku {
    String judul, penulis;
    int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    void infoBuku(){
        System.out.printf("%-5s %-5s %-5d\n", judul, penulis, tahunTerbit);
        System.out.println();
    }

}
