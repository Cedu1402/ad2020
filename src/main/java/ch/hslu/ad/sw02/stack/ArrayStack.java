package ch.hslu.ad.sw02.stack;

import java.util.EmptyStackException;

public class ArrayStack implements Stack{

    private int lastIndex = -1; // da mit +1 das erste element auf index 0 landet.
    private String[] elements = new String[1];

    @Override
    public void push(String element) {
        this.lastIndex++;
        if(this.lastIndex == this.elements.length){
            this.lastIndex--;
            throw new StackOverflowError();
        }
        this.elements[this.lastIndex] = element;
    }

    @Override
    public String pop() {
        if(this.lastIndex < 0){
            throw new EmptyStackException();
        }
        int lastElement = lastIndex;
        lastIndex--;
        return this.elements[lastElement];
    }
}
