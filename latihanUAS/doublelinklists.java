package latihanUAS;

public class doublelinklists {
    int max, size;
    node head, tail;

    public doublelinklists(int max) {
        this.max = max;
        car car1[] = new car[max];
        this.head = this.tail = null;
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
            head = tail = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("mobil ditambahkan!");
    }

    public car kurang(){
        if(isEmpty()){
            System.out.println("antrian kosong!");
        }
        car temp = head.data;
        head = head.next;
        if(head != null){
            head.prev = null;
        } else{
            tail = null;
        }
        size--;
        System.out.println("Mobil " + temp.plat + " sudah dikeluarkan!");
        return temp;
    }

    public void tampilSemua(){
        if(isEmpty()){
            System.out.println("kosong!");
        }
        node temp = head;
        while(head != null){
            if(temp == null){
                break;
            }
            temp.data.infoCar();
            temp = temp.next;
        }
    }
}
