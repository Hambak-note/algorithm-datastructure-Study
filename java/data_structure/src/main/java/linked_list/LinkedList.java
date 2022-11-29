package linked_list;

public interface LinkedList<E> {

    void push(E element);
    E pop();
    void unShift(E element);
    E shift();
    void insert(int index, E element);
    E remove(int index);

    int size();
    E findItemByIndex(int index);

}
