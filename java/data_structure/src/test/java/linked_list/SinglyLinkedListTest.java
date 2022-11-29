package linked_list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SinglyLinkedListTest {

    LinkedList<Integer> singleLinked;

    @BeforeEach
    void setUp(){
        singleLinked = new SinglyLinkedList<>();
        singleLinked.push(1);
        singleLinked.push(2);
        singleLinked.push(3);
        singleLinked.push(4);
    }

    @Test
    @DisplayName("push test")
    void push() {
        singleLinked.push(5);
        assertThat(singleLinked.findItemByIndex(4)).isEqualTo(5);
        assertThat(singleLinked.size()).isEqualTo(5);
    }

    @Test
    @DisplayName("pop test")
    void pop() {
        assertThat(singleLinked.pop()).isEqualTo(4);
        assertThat(singleLinked.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("unShift test")
    void unShift() {
        singleLinked.unShift(0);
        assertThat(singleLinked.size()).isEqualTo(5);
        assertThat(singleLinked.findItemByIndex(0)).isEqualTo(0);
    }

    @Test
    @DisplayName("shift test")
    void shift() {
        assertThat(singleLinked.shift()).isEqualTo(1);
        assertThat(singleLinked.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("insert test")
    void insert() {
        singleLinked.insert(3, 33);
        assertThat(singleLinked.size()).isEqualTo(5);
        assertThat(singleLinked.findItemByIndex(3)).isEqualTo(33);

    }

    @Test
    @DisplayName("remove test")
    void remove() {
        assertThat(singleLinked.remove(2)).isEqualTo(3);
        assertThat(singleLinked.size()).isEqualTo(3);
    }
}