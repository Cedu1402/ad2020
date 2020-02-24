package ch.hslu.ad.sw00;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Allocation {

    private final long size;
    private final long address;

    public Allocation(long size){
        this.size = size;
        this.address = ThreadLocalRandom.current().nextLong(100);;
    }

    public long getSize() {
        return size;
    }

    @Override
    public final boolean equals(Object object) {
        if(object == this) {
            return true;
        }
        if(!(object instanceof Allocation)) {
            return false;
        }
        final Allocation other = (Allocation) object;
        return(other.size == this.size) && (other.address == this.address);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.size, this.address);
    }
}
