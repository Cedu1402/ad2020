package ch.hslu.ad.sw02.list;
import ch.hslu.ad.sw02.Allocation;

public class Node implements Iterator{
    private Node next;
    private Allocation item;

    public Node(Allocation item){
        this.item = item;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Allocation getItem() {
        return item;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Node next() {
        return next;
    }
}

