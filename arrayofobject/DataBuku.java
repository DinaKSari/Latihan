package arrayofobject;

public class DataBuku {
    Buku[] arr = new Buku[5];
    int max;
    void tambah(Buku bk){
        
        if(max == 0 || max != 5){
            arr[0+max] = bk;
            max++;
        }
    }

    void tampilSemua(){
        for(int i = 0; i < arr.length;i++){
            arr[i].infoBuku();
        }
    }

}
