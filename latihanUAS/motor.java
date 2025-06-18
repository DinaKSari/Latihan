public class motor {
    String merk;
    String plat;

    motor(String merk, String plat){
        this.merk = merk;
        this.plat = plat;
    }

    public void infomotor(){
        System.out.println("merk: " + merk + "\n" + "plat: " + plat);
    }
}
