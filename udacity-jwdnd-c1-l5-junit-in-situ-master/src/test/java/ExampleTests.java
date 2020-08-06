import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTests {

    private static final int TEST_LIMIT = 1000;

    private Example example;

    @BeforeEach
    public void beforeAll() {
        example = new Example();
    }

    @Test
    public void testGetMessage() {
        assertEquals(
                "Hello, tests!",
                example.getMessage()
        );
    }

    @Test
    public void testParityEven() {
        for (int i = 2; i < TEST_LIMIT; i += 2) {
            assertEquals("even", example.parity(i));
        }
    }

    @Test
    public void testParityOdd() {
        for (int i = 1; i < TEST_LIMIT; i += 2) {
            assertEquals("odd", example.parity(i));
        }
    }

    @Test
    public void testDirectionsValid() {
        assertEquals("up", example.direction(0));
        assertEquals("right", example.direction(1));
        assertEquals("down", example.direction(2));
        assertEquals("left", example.direction(3));
    }

    @Test
    public void testDirectionsInvalid() {
        assertNull(example.direction(-1));
        assertNull(example.direction(4));
    }

    @Test
    public void testDiv() {
        assertThrows(ArithmeticException.class, () -> {
            example.div(1, 0);
        });
    }

    @Test
    public void testGetCount() {
        assertEquals(0, example.getCount());
        assertEquals(1, example.getCount());
        assertEquals(2, example.getCount());
    }

    @Test
    public void testGetCountAgain() {
        assertEquals(0, example.getCount());
        assertEquals(1, example.getCount());
        assertEquals(2, example.getCount());
    }

}



