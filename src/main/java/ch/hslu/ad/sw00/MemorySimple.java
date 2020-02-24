package ch.hslu.ad.sw00;
import java.util.HashSet;

public class MemorySimple implements  Memory{

    private final long memorySize;
    private HashSet<Allocation> allocations = new HashSet<>();

    public MemorySimple(long size){
        this.memorySize = size;
    }

    @Override
    public Allocation malloc(long size) {
        if(!this.enoughSpaceAvailable(size)){
            throw new OutOfMemoryError();
        }

        Allocation allocation = new Allocation(size);
        this.allocations.add(allocation);
        return allocation;
    }

    @Override
    public void free(Allocation allocation) {
        this.allocations.remove(allocation);
    }

    private boolean enoughSpaceAvailable(long size){
        if(this.allocations.stream()
                .mapToLong(Allocation::getSize)
                .sum() + size > this.memorySize){
            return false;
        };
        return true;
    }
}
