package linked_list;

public class SinglyLinkedList<E> implements LinkedList<E>{

    private int size;
    private Node<E> first;
    private Node<E> last;


    public SinglyLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element, null);
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
    public E pop() {
        if(size == 0){
            System.out.println("List 가 비었습니다.");
            return null;
        }

        Node<E> prev = first;
        E popItem = last.item;

        while(prev.next != last && prev != last){
            prev = prev.next;
        }

        prev.next = null;
        last = prev;
        size--;
        return popItem;
    }

    @Override
    public void unShift(E element) {
        Node<E> newNode = new Node<>(element, null);
        if(size == 0){
            first = newNode;
            last = newNode;
            size++;
            return;
        }

        newNode.next = first;
        first = newNode;
        size++;
    }

    @Override
    public E shift() {
        if(size == 0){
            System.out.println("List 가 비었습니다.");
            return null;
        }

        E returnItem = first.item;
        Node<E> next = first.next;
        first = next;

        size--;
        return returnItem;
    }

    
    //null값 처리
    @Override
    public void insert(int index, E element) {
        //index 로 0이 들어온 경우
        if(index == 0) { unShift(element); return;}

        Node<E> newNode = new Node(element, null);
        Node<E> prev = findNodeByIndex(index -1);
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    @Override
    public E remove(int index) {

        if(index == 0) {return shift();}
        if(index == size-1) { return pop();}

        Node<E> prev = findNodeByIndex(index-1);
        Node<E> delNode = prev.next;
        prev.next = delNode.next;
        size--;
        return delNode.item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E findItemByIndex(int index) {
        Node<E> findNode = findNodeByIndex(index);
        return findNode.item;
    }

    private Node<E> findNodeByIndex(int index){
        if(index > size-1){
            System.out.println("저장된 리스트의 길이를 넘어선 위치입니다.");
            return null;
        }

        Node<E> findNode = first;

        for(int i = 0; i < index; i++){
            findNode = findNode.next;
        }

        return findNode;
    }

    @Override
    public String toString() {
        return super.toString();
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

