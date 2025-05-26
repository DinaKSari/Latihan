package arrayofobject;

public class DataBuku {
    Buku[] arr = new Buku[3];
    int max;
    void tambah(Buku bk){
        
        if(max == 0 || max != 5){
            arr[0+max] = bk;
            max++;
        }
    }

    void tampilSemua(){
        System.out.println("Judul | Penulis | tahun terbit");
        for(int i = 0; i < arr.length;i++){
            arr[i].infoBuku();
        }
    }

    void findByThn(int thn){
        for(int i = 0; i< arr.length;i++){
            if (arr[i].tahunTerbit == thn){
                System.out.println("Data ditemukan!");
                arr[i].infoBuku();
                break;
            } else{
                System.out.println("Data tidak ditemukan!");
            }
        }
    }

}
