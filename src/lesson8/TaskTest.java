package lesson8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void solveOne() {
        Task task = new Task("1 2 3");
        assertEquals(6,task.solve());
    }
    @Test
    void solveTwo() {
        Task task = new Task("1 2a 3");
        assertEquals(4,task.solve());
    }
    @Test
    void solveThree() {
        Task task = new Task("14 2 3");
        assertEquals(19,task.solve());
    }

    @Test
    void solveFour() {
        Task task = new Task("14b 2 3");
        assertEquals(5,task.solve());
    }
}