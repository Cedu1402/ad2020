package ch.hslu.ad.sw02.stack;

public interface Stack {
    /**
     * Adds new element to stack.
     * Throws StackOverFlow exception if stack is full.
     * @param element new Element to add to Stack.
     */
    void push(String element);

    /**
     * Deletes last element and returns it.
     * @return newest element in Stack. (LIFO).
     */
    String pop();
}
