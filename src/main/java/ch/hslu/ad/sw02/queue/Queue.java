package ch.hslu.ad.sw02.queue;

public interface Queue {
    /**
     * Einfügen eines Elements in die Queue.
     * @param element das einzufügende element.
     */
    void enqueue(char element);

    /**
     * Das erste Element aus der Queue holen.
     * @return Das erste Element das in die Queue eingefühgt wurde.
     */
    char dequeue();
}
