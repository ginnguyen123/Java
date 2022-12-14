import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;
    public MyLinkedList(Object data){
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data){
            this.data = data;
        }
        public Object getData(){return this.data;}
    }
    public void add(int index, E data){
        Node temp = head;
        Node holder;
        for (int i = 0; i< index - 1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
//    public void addLast(E data){
//
//    }
    public int size(){
        return numNodes;
    }

}
