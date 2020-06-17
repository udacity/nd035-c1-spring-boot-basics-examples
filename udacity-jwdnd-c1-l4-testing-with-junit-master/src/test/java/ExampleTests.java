import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTests {

    private List<Integer> testList;

    @BeforeEach
    public void beforeEach() {
        testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
    }

    @AfterEach
    public void afterEach() {
        testList = null;
    }

    @Test
    public void testAddZero() {
        int a = 10;
        int b = 0;
        int c = a + b;
        assertEquals(a, c);
    }

    @Test
    public void testDivideZero() {
        int a = 10;
        int b = 0;
        assertThrows(ArithmeticException.class, () -> {
            int c = a / b;
        });
    }

    @Test
    public void testListContains() {
        assertTrue(testList.contains(1));
        testList.remove(0);
        assertFalse(testList.contains(1));
    }

}
