package linked_list;

public class SinglyLinkedList<E> implements LinkedList{

    private int size;
    private Node<E> first;
    private Node<E> last;

    public SinglyLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node(element, null);
        if(size == 0){
            first = newNode;
            last = newNode;
            size++;
            return;
        }

        last.next = newNode;
        last = newNode;
        size++;
    }

    @Override
    public Object pop() {
        if(size == 0){

        }


        return null;
    }

    @Override
    public void unShift(Object element) {

    }

    @Override
    public Object shift() {
        return null;
    }

    @Override
    public void insert(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }



    private static class Node<E>{
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}

