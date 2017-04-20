public class Stack<T extends Object> {
    
    private Node<T> top;
    
    public Stack()
    {
        top = null;
    }
    
    public void push(T newItem)
    {
        Node<T> new_node = new Node(newItem, top);
        top = new_node;
    }
    
    public T peek()
    {
        if ( isEmpty() )
            return null;
        return top.getData();
    }
    
    public T pop()
    {
        T value = this.peek();
        
        if ( value != null )
            top = top.getNext();
        return value;
    }
    
    public boolean isEmpty()
    {
        return top==null;
    }
    
    public void clear()
    {
        top = null;
    }
    
    public void display()
    {
        Node<T> current = top;
        
        if ( current == null )
            System.out.println("Stack is empty");
        
        else
        {
            while ( current != null )
            {
                System.out.print(current.getData()+" ");
                current = current.getNext();
            }
            System.out.println();
        }
    }
    
    // this is a private inner class, only needs to be used by the
    // public outer linkedlist class
    private class Node<T> {
        // next node in the linked list, if null, then end of list

        Node next;
        // data element of the node
        T data;

        // constructor for if we want to specify a particular node for
        // the node to point to
        public Node(T dataValue, Node nextNode) {
            next = nextNode;
            data = dataValue;
        }

        // return the data in the node
        public T getData() {
            return data;
        }

        // returns the next node, if any
        public Node getNext() {
            return next;
        }
    }
}
