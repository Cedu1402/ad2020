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
        while (node.hasNext()) {
            node = node.next();
            counter ++;
        }
        return counter;
    }

    public boolean contains(Allocation item){
        Node node = this.head;
        if(node.getItem().equals(item)){
            return true;
        }
        while (node.hasNext()) {
            node = node.next();
            if(node.getItem().equals(item)){
                return true;
            }
        }
        return false;
    }

    public Allocation poll(){
        Allocation item = this.head.getItem();
        this.head = this.head.next();
        return item;
    }

    public void remove(Allocation item){
        Node node = this.head;
        if(this.head.getItem().equals(item)){
            this.head = this.head.next();
        }
        while (node.hasNext()) {
            if(node.next().getItem().equals(item)){
                if(!node.next().hasNext()){
                    node.setNext(null);
                }else{
                    node.setNext(node.next().next());
                }
                return;
            }
            node = node.next();
        }
    }
}