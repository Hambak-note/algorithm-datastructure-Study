package linked_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

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
}