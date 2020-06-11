package ch.hslu.ad.sw04;

import java.util.Objects;

public class Mountain implements Comparable<Mountain>{
    private final long height;

    public Mountain(long height){
        this.height = height;
    }

    @Override
    public boolean equals(final Object object){
        if(object == this){
            return true;
        }
        if(!(object instanceof Mountain)){
            return false;
        }
        final Mountain other = (Mountain) object;
        return other.height == this.height;
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(this.height);
    }

    @Override
    public int compareTo(Mountain mountain) {
        if(mountain.equals(this)){
            return 0;
        }else if(this.height < mountain.height){
            return -1;
        }else{
            return 1;
        }
    }

    @Override
    public String toString(){
        return "Height: " + this.height;
    }
}
