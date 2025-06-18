package latihanUAS;
public class node {
    node next;
    node prev;
    car data;

    node(node next, node prev, car data){
        this.next = next;
        this.prev =prev;
        this.data = data;
    }
}
