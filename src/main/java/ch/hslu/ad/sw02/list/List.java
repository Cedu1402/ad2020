package ch.hslu.ad.sw02.list;
import ch.hslu.ad.sw02.Allocation;

public class List {

    private Node head;

    public void Add(Allocation item) {
        Node previousNode = this.head;
        this.head = new Node(item);
        this.head.setNext(previousNode);
    }

    public int size(){
        if(this.head == null){
            return 0;
        }
        Node node = this.head;
        int counter = 1;
        while (node.getNext() != null) {
            node = node.getNext();
            counter ++;
        }
        return counter;
    }
}