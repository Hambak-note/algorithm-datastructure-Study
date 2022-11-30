package linked_list;

public class DoublyLinkedList<E> implements LinkedList<E>{

    private Node<E> first;
    private Node<E> last;

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }
    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element, null, null);
        if(first == null){
            first = newNode;
            last = newNode;
            return;
        }
        last.next = newNode;
        newNode.prev = last;
        last = newNode;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public void unShift(E element) {

    }

    @Override
    public E shift() {
        return null;
    }

    @Override
    public void insert(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E findItemByIndex(int index) {
        return null;
    }


    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(E item, Node<E> next, Node<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
