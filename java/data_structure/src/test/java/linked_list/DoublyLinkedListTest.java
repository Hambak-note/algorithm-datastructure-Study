package linked_list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class DoublyLinkedListTest {


    DoublyLinkedList<Integer> dLikedList;

    @BeforeEach
    void setUp(){
        dLikedList = new DoublyLinkedList<>();
        dLikedList.push(1);
    }


    @Test
    @DisplayName("push test")
    void push() {
        dLikedList.push(2);
        assertThat(dLikedList.toString()).isEqualTo("1,2");
    }

    @Test
    @DisplayName("pop test")
    void pop(){
       assertAll(
                () -> assertThat(dLikedList.pop()).isEqualTo(1),
                //빈 리스트에서 값을 꺼내려고 하는 경우
                () -> {
                    Exception exception = assertThrows(IllegalStateException.class,
                            () -> dLikedList.pop());
                }
        );
    }

    @Test
    @DisplayName("unShift test")
    void unShift(){
        dLikedList.unShift(0);
        assertThat(dLikedList.toString()).isEqualTo("0,1");
    }

    @Test
    @DisplayName("shift test")
    void shift(){
        assertAll(
                () -> assertThat(dLikedList.shift()).isEqualTo(1),
                () -> {
                    Exception exception = assertThrows(IllegalStateException.class,
                            () -> dLikedList.shift());
                }
        );
    }

    @Test
    @DisplayName("findItemByIndex test")
    void findItemByIndex(){
        assertAll(
                () -> assertThat(dLikedList.findItemByIndex(0)).isEqualTo(1),
                () -> {
                    Exception exception = assertThrows(IllegalStateException.class,
                            () -> dLikedList.findItemByIndex(5));
                }
        );
    }

    @Test
    @DisplayName("insert test")
    void insert(){
        dLikedList.insert(0, 2);
        assertAll(
                () -> assertThat(dLikedList.toString()).isEqualTo("2,1"),
                () -> {
                    Exception exception = assertThrows(IllegalStateException.class,
                            ()->dLikedList.insert(3, 2));
                }
        );
    }

    @Test
    @DisplayName("remove test")
    void remove(){
        assertAll(
                () -> assertThat(dLikedList.remove(0)).isEqualTo(1),
                () -> {
                    Exception exception = assertThrows(IllegalStateException.class,
                            () -> dLikedList.remove(3));
                }
        );

    }
}