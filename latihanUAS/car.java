package latihanUAS;
public class car{
    String merk;
    String plat;
    int tahun;
    int stok;

    car(String merk, String plat, int tahun, int stok){
        this.merk = merk;
        this.plat = plat;
        this.stok = stok;
        this.tahun = tahun;
    }

    void infoCar(){
        System.out.println("Merk: " + merk + "\n" + " plat: " + plat + "\n" + " tahun dibuat: " + tahun + "\n" + " stok: " + stok);
    }
}