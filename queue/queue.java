package queue;
public class queue {
    pelanggan[] data;
    int front, rear, size, max;

    public queue(int max){
        this.max = max;
        this.data = new pelanggan[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
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

    public void tambah(pelanggan pl){
        if(isFull()){
            
        }
    }
}
