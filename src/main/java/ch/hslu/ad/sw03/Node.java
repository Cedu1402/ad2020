package ch.hslu.ad.sw03;

public interface Node<T extends Comparable<T>> {
    /**
     * Adds Child to the right or left depending on size.
     * @param child child to add to node.
     */
    void add(T element);

    /**
     * Access element of node.
     * @return element of node.
     */
    T getElement();

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
