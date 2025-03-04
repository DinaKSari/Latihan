
import java.util.Calendar;
import java.util.Date;

public class Mobil {
    public String merk, model;
    public int thn;
    Date tgl = new Date();
    Calendar kalender = Calendar.getInstance();

    public void info(){
        System.out.println("Merk mobil : " + merk);
        System.out.println("Model mobil : " + model);
        System.out.println("Tahun dikeluarkan : " + thn);
    }

    public int hitungTahun(int tahun){
        kalender.setTime(tgl);
        int thun = kalender.get(Calendar.YEAR);
        int tahunAfter = thun - tahun;
        System.out.println("Usia mobil : " + tahunAfter);
        return tahunAfter;
    }
}
