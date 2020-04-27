package ch.hslu.ad.sw09;

public enum SortEnum {
    InsertSort("Inster Sort"),
    SelectionSort( "Selection Sort"),
    BubbleSort("Bubble Sort"),
    BubbleSortOptimized("Bubble Sort Optimized");

    private SortEnum(String value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value;
    }

    private final String value;
}
