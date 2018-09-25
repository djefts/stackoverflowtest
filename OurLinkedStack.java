/**
 * @param <T>
 * @author dgb
 */
public class OurLinkedStack<T> implements OurStack<T> {
    private LinkNode<T> head;
    private int count;

    public OurLinkedStack() {
        head = null;
        count = 0; //number of elements in the stack
    }

    @Override
    public T push(T data)  //Add element to 'top' of stack and return the parameter
    {
        if(data == null) return null;
        LinkNode<T> node = new LinkNode<T>(data);
        count++;
        if(head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        return data;
    }

    @Override
    public T pop() { //Remove element from 'top' of stack and return it.
        if(head == null) return null;



        return head.data;
    }

    @Override
    public T peek() { //Return element at 'top' of stack without removing it
        if(head == null) return null;
        return head.data;
    }

    @Override
    public int size() { //Return number of elements on the stack
        return count;
    }

    @Override
    public boolean isEmpty() { //Return true if stack is empty, false otherwise.
        return head == null;
    }

    @Override
    public void clear() { //Resets the stack.
        head = null;
    }


    //Inner Class
    private class LinkNode<T> {
        private T data;
        private LinkNode<T> next;

        private LinkNode(T data) {
            this.data = data;
            next = null;
        }

    }

}//End OurLinkedStack
