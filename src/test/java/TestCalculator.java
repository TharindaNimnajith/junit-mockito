import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnit;
//import org.mockito.junit.MockitoRule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@SuppressWarnings("CommentedOutCode")
public class TestCalculator {
    Calculator calculator1;

    Calculator calculator2;

    ICalculatorService iCalculatorService = mock(ICalculatorService.class);

    /*
    @Mock
    ICalculatorService iCalculatorService1;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    */

    @BeforeEach
    public void setUp() {
        calculator1 = new Calculator();
        calculator2 = new Calculator(iCalculatorService);
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator1.add(2, 3));
    }

    @SuppressWarnings("TestFailedLine")
    @Test
    public void testAddIncorrect() {
        assertEquals(5, calculator1.addIncorrect(2, 3));
    }

    @SuppressWarnings("TestFailedLine")
    @Test
    public void testAddService1() {
        assertEquals(5, calculator1.addService1(2, 3));
    }

    @Test
    public void testAddService2() {
        assertEquals(5, calculator1.addService2(2, 3));
    }

    @SuppressWarnings("TestFailedLine")
    @Test
    public void testAddService3() {
        assertEquals(5, calculator2.addService3(2, 3));
    }

    @Test
    public void testAddService4() {
        doReturn(5).when(iCalculatorService.add(2, 3));
        //when(iCalculatorService.add(2, 3).thenReturn(5));
        verify(iCalculatorService.add(2, 3));
        assertEquals(5, calculator2.addService3(2, 3));
    }
}
