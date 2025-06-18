public class linklistmotor {
    nodeMotor front, rear;
    int max, size;

    public linklistmotor(int max) {
        this.max = max;
        this.size = 0;
        this.rear = null;
        this.front = null;
    }

    public boolean isEmpty(){
        if(size == 0){
            System.out.println("kosong");
            return true;
        } else{
            return false;
        }
    }

    public boolean isFull(){
        if(size == max){
            System.out.println("penuh");
            return true;
        } else{
            return false;
        }
    }

    public void enqueue(motor mtr){
        if(isFull()){
            System.out.println("PENUH");
        }
        nodeMotor newNode = new nodeMotor(null, mtr);
        if(isEmpty()){
            front = rear = newNode;
        } else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(newNode.data.plat+" berhasil masuk antrian");
    }

    public motor dequeue(){
        if(isEmpty()){
            System.out.println("KOSONG");
            return null;
        }
        motor temp = front.data;
        front.next = front;
        if(isEmpty()){
            rear = null;
        }
        size--;
        System.out.println(temp.plat+ " telah dikeluarkan");
        return temp;
    }

    public void tampilSemua(){
        if(isEmpty()){
            System.out.println("KOSONG");
        }
        nodeMotor temp = front;
        while (temp != null) { 
            temp.data.infomotor();
            temp = temp.next;
            if(temp == null){
                System.out.print("");
            }
        }
    }

    public void clear(){
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public int jumlahAntrian(){
        return size;
    }
}
