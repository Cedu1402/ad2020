package ch.hslu.ad.sw02.queue;

import java.util.NoSuchElementException;

public class QueueArray implements Queue {

    private int readIndex = -1;
    private int writeIndex = 0;

    private char[] elements = new char[8];

    @Override
    public void enqueue(char element) {
        if(this.writeIndex == this.readIndex){
            throw new IllegalStateException("Queue Full");
        }
        this.elements[this.writeIndex] = element;
        this.writeIndex++;
        if(this.writeIndex == this.elements.length){
            this.writeIndex = 0;
        }
        // read auf erstes element wenn noch keines vorher eingefühgt wrude.
        if(this.readIndex == -1){
            this.readIndex++;
        }
    }

    @Override
    public char dequeue() {
        int oldReadIndex = this.readIndex;

        if(this.readIndex < 0){
            throw new NoSuchElementException();
        }
        this.readIndex++;

        // rotation im ring buffer.
        if(this.readIndex == this.elements.length){
            this.readIndex = 0;
        }
        // auf -1 da wenn write Index erreicht
        // kein weiteres element zulesen ist.
        if(this.readIndex == this.writeIndex){
            this.readIndex = -1;
        }
        return this.elements[oldReadIndex];
    }
}
