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
        if(first == null){
            throw new IllegalStateException("List가 비어 있습니다");
        }

        E popItem = last.item;
        if(first == last){
            first = null;
            last = null;
            return popItem;
        }

        last = last.prev;
        last.next = null;

        return popItem;
    }

    @Override
    public void unShift(E element) {
        Node<E> newNode = new Node<>(element, null, null);
        if(first == null){
            first = newNode;
            last = newNode;
            return;
        }

        newNode.next = first;
        first.prev = newNode;
        first = newNode;
    }

    @Override
    public E shift() {
        if(first == null){
            throw new IllegalStateException("List가 비어 있습니다");
        }

        E popItem = first.item;
        if(first == last){
            first = null;
            last = null;
            return popItem;
        }

        first.next.prev = null;
        first = first.next;
        return popItem;
    }

    @Override
    public void insert(int index, E element) {
        if(index == 0) { unShift(element);}

        Node<E> newNode = new Node<>(element, null, null);
        Node<E> findNode = findNodeByIndex(index);
        newNode.prev = findNode.prev;
        newNode.next = findNode;
        findNode.prev = newNode;
    }

    @Override
    public E remove(int index) {

    }

    @Override
    public E findItemByIndex(int index) {
        Node<E> findNode = findNodeByIndex(index);
        return findNode.item;
    }

    private Node<E> findNodeByIndex(int index){
        Node<E> temp = first;
        int currentIdx = 0;
        while(temp.next != null){
            if(currentIdx == index){
                return temp;
            }
            temp = temp.next;
            currentIdx++;
        }

        if(currentIdx == index) return temp;

        throw new IllegalStateException("저장된 리스트의 길이를 넘어선 위치입니다.");
    }

    @Override
    public String toString() {
        if(first == null) return "";
        StringBuilder sb = new StringBuilder();

        Node<E> temp = first;
        while(temp.next != null){
            sb.append(temp.item);
            sb.append(",");
            temp = temp.next;
        }
        sb.append(temp.item);

        return sb.toString();
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
