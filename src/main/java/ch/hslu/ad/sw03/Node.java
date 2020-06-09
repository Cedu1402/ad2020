package ch.hslu.ad.sw03;

public interface Node<T extends Comparable<T>> {
    /**
     * Adds Child to the right or left depending on size.
     * @param child child to add to node.
     */
    void add(T element);

    /**
     * Get element of node.
     * @return element.
     */
    T getElement();

    /**
     * Search for element with in order traversing.
     * @return if element was found.
     */
    boolean inOrderSearch(T element);

    /**
     * Search for element with pre order traversing.
     * @return if element was found.
     */
    boolean preOrderSearch(T element);


    /**
     * Search for element with post order traversing.
     * @return if element was found.
     */
    boolean postOrderSearch(T element);

    /**
     * Get left child node.
     * @return left child node.
     */
    Node<T> getLeftChild();

    /**
     * Get right child node.
     * @return right child node.
     */
    Node<T> getRightChild();
}
