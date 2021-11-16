/**
 * Stack.java
 * Kevin Lou
 * 2021/11/13
 * A stack implementation with similar methods to java.util.Stack
 */

public class Stack<E>{

    private StackNode<E> topNode;
    private int size;

    public Stack() {}

    /**
     * Pushes new element to the top of the stack
     */
    public void push(E element){
        if(size == 0) topNode = new StackNode<>(element);
        else topNode = new StackNode<>(element, topNode);
        size++;
    }

    /**
     * Pops top element out to the stack
     */
    public E pop(){
        E ret = topNode.getData();
        size--;
        topNode = topNode.getChild();
        return ret;
    }

    /**
     * Returns whether or not the stack is empty
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * returns size of the stack
     */
    public int size(){
        return size;
    }

    /**
     * Returns the data of the top element in the stack
     */
    public E peek(){
        return topNode.getData();
    }
}
