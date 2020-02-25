package ch.hslu.ad.sw02;

import java.util.Objects;

public class Allocation {

    private final long size;
    private final long address;

    public Allocation(long size, long address){
        this.size = size;
        this.address = address;
    }

    public long getSize() {
        return size;
    }

    public long getAddress() {
        return address;
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
