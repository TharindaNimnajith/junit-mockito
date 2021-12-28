import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    Calculator calculator = null;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @SuppressWarnings("TestFailedLine")
    @Test
    public void testAddIncorrect() {
        assertEquals(5, calculator.addIncorrect(2, 3));
    }

    @SuppressWarnings("TestFailedLine")
    @Test
    public void testAddService() {
        assertEquals(5, calculator.addService(2, 3));
    }

    @Test
    public void testNewAddService() {
        assertEquals(5, calculator.addNewService(2, 3));
    }
}
