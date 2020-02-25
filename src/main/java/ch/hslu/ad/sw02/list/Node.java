package ch.hslu.ad.sw02.list;
import ch.hslu.ad.sw02.Allocation;

public class Node {
    private Node next;
    private Allocation item;

    public Node(Allocation item){
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public Allocation getItem() {
        return item;
    }

}

