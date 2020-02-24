package ch.hslu.ad.sw00;

public interface Memory {
    public Allocation malloc(long size);
    public void free(Allocation allocation);
}
