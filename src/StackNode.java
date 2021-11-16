/**
 * StackNode.java
 * Kevin Lou
 * 2021/11/13
 * A stack node that holds data and a pointer to the node beneath it.
 * Used in the stack implementation in the Stack class.
 */

public class StackNode<E>{

    private final E data;
    private final StackNode<E> child;

    /**
     * Constructor
     */
    public StackNode(){
        data = null;
        child = null;
    }

    /**
     * Constructor
     */
    public StackNode(E data){
        this.data = data;
        child = null;
    }

    /**
     * Constructor
     */
    public StackNode(E data, StackNode<E> child) {
        this.data = data;
        this.child = child;
    }

    /**
     * Getter for data
     */
    public E getData() {
        return data;
    }

    /**
     * Getter for child
     */
    public StackNode<E> getChild() {
        return child;
    }
}
