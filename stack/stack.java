package stack;
public class stack{
    int top;
    int size;
    mahasiswa[] data;

    public stack(int size){
        this.size = size;
        top = -1;
        data = new mahasiswa[size];
    }
    
    boolean isFull(){
        if(top == size){
            return true;
        } else{
            return false;
        }
    }

    boolean isEmpty(){
        if(top==-1){
            return true;
        } else{
            return false;
        }
    }

    void push(mahasiswa mhs){
        if(!isFull()){
            top++;
            data[top] = mhs;
            size++;
            
        } else{
            System.out.println("Stack full!");
        }
    }

    public mahasiswa pop(){
        if(!isEmpty()){
            mahasiswa m = data[top];
            size--;
            top--;
            return m;
        } else{
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public mahasiswa peek(){
        if(!isEmpty()){
            return data[top];
        } else{
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void tampilSemua(){
        if(!isEmpty()){
            System.out.println("====== DATA MAHASISWA =========");
        for (int i = 0; i <= top;i++) {
            data[i].infoMhs();
        }
        } else{
            System.out.println("Stack kosong!");
        }
    }
}