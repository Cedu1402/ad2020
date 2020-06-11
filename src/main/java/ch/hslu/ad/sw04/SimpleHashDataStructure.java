package ch.hslu.ad.sw04;

import java.util.Arrays;

public class SimpleHashDataStructure implements SimpleDataStructure {
    private final Integer[] data = new Integer[10];
    private final Object thumbstone = new Object();

    @Override
    public void add(Integer element) {
        // nothing to do if already inside.
        if (this.contains(element) != -1) {
            return;
        }
       // when already in use
       int index = this.getIndex(element);
       if(this.data[index] != null && this.data[index] != this.thumbstone){
           int i = index + 1;
           boolean foundFreePlace = false;
           while(!foundFreePlace && i != index){
               if(this.data[i] == null && this.data[i] == this.thumbstone){
                   foundFreePlace = true;
               }else{
                   if(i == this.data.length - 1){
                       // start at beginning.
                       i = 0;
                   }else{
                       i++;
                   }
               }
           }
           if(foundFreePlace){
               this.data[i] = element;
           }else{
               throw new IllegalStateException("Data Structre Full");
           }
       }

    }

    @Override
    public int contains(Integer element) {
        long result = Arrays.stream(this.data)
                .filter(data -> data.equals(element))
                .count();

        if(result == 0){
            return -1;
        }
        return 0;
    }

    @Override
    public void remove(Integer element) {

    }


    private int getIndex(Integer element) {
        return element.hashCode() % this.data.length;
    }
}
