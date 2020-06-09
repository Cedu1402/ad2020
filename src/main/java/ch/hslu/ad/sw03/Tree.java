package ch.hslu.ad.sw03;

public interface Tree <T extends Comparable<T>> {
    /**
     * Add new element to tree.
     * @param element element to add.
     */
    void add(T element);

    /**
     * Remove element from tree.
     * @param element element to remove.
     */
    void remove(T element);

    /**
     * Check if element is in tree.
     * @param element element to search for.
     * @return if element is in tree.
     */
    boolean inOrderSearch(T element);


    /**
     * Search for element with post order traversing.
     * @return if element was found.
     */
    boolean postOrderSearch(T element);

    /**
     * Search for element with pre order traversing.
     * @return if element was found.
     */
    boolean preOrderSearch(T element);
}
