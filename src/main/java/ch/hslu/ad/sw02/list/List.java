package ch.hslu.ad.sw02.list;
import ch.hslu.ad.sw02.Allocation;

public class List {

    private Node item;

    public void Add(Allocation item){
        this.item = new Node(item);
    }

    public int size(){
    }
}
