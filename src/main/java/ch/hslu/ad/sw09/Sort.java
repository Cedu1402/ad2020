package ch.hslu.ad.sw09;

public class Sort{


    public static void insertionSort(final int[] a) {
        int elt;
        int j;
        for (int i = 1; i < a.length; i++) {
            elt = a[i]; // next elt for insert
            j = i; // a[0]..a[j-1] already sorted
            while ((j > 0) && (a[j - 1] > elt)) {
                a[j] = a[j - 1]; // shift right
                j--; // go further left
            }
            a[j] = elt; // insert elt
        } // a[0]...a[j] sorted
    }

    public static void selectionSort(final int[] a) {
        int smallestIndex;

        for(int j = 0; j < a.length; j++){
            smallestIndex = j;
            for(int i = j + 1; i < a.length; i++){
                if(a[smallestIndex] > a[i]){
                    smallestIndex = i;
                }
            }
            swap(a, j, smallestIndex);
        }
    }

    public static void bubbleSort(final int[] a) {
        for(int i = 0; i < a.length; i++){
            for(int j = 1; j < a.length - i; j++){
                if(a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                }
            }
        }
    }

    public static void bubbleSortOptimized(final int[] a) {
        for(int i = 0; i < a.length; i++){
            boolean swapped = false;
            for(int j = 1; j < a.length - i; j++){
                if(a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }

    public static void shellSort(final int[] a) {
        // Create Hibbard steps.
        int maxHibbard = (int) (Math.log((double)(a.length /3 )) / Math.log(2));
        int[] stepSize = new int[maxHibbard];
        stepSize[stepSize.length -1] = 1;
        for(int i = maxHibbard - 2; i >=  0; i--){
            stepSize[i] = stepSize[i+1] * 2 + 1;
        }
        // {3, 2, 6, 3, 2}
        for(int step = 0; step < stepSize.length; step++){
            for(int i = stepSize[step]; i < a.length; i = i + stepSize[step]){
                for(int j = i - stepSize[step]; j > 0 && a[j] > a[i]; j = j - stepSize[step]){
                    swap(a, i, j);
                }
            }
        }
    }

    public static void swap(final int[] a, int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

}
