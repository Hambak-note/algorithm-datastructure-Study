package linked_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.assertj.core.api.Assertions.*;


class DoublyLinkedListTest {


    DoublyLinkedList<Integer> dLikedList;

    @BeforeEach
    void setUp(){
        dLikedList = new DoublyLinkedList<>();
        dLikedList.push(1);
        dLikedList.push(2);
        dLikedList.push(3);
        dLikedList.push(4);
        dLikedList.push(5);
    }


    @Test
    @DisplayName("push test")
    void push() {
        assertThat(dLikedList.toString()).isEqualTo("1,2,3,4,5");
    }
}