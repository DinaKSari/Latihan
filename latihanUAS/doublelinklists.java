package latihanUAS;
public class doublelinklists {
    int max, size;
    node head, rear;

    public doublelinklists(int max) {
        this.max = max;
        car car1[] = new car[max];
        
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull(){
        if(size == max){
            return true;
        } else{
            return false;
        }
    }

    public void tambah(car c1){
        node newNode = new node(null, null, c1);
        if(isFull()){
            System.out.println("Isi penuh!");
        }
        if(isEmpty()){
            head = rear = c1;
        }
    }
}
