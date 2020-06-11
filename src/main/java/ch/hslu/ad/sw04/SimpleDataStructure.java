package ch.hslu.ad.sw04;

public interface SimpleDataStructure {
    /**
     * Add element to  data structure .
     * @param element new element.
     */
    void add(Integer element);

    /**
     * Check if data structure contains element.
     * @param element element to find.
     * @return index of element (-1 if not found)
     */
    int contains(Integer element);

    /**
     * Remove element from data structure.
     * @param element element to remove.
     */
    void remove(Integer element);

}
