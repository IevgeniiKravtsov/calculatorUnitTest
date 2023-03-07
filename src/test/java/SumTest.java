import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    Calculator calculator;

    @BeforeEach
    public void beforeTest() {
        calculator = new Calculator();
        System.out.println("before each");
    }

    @Test
    @DisplayName("Addition with Long")
    public void sumLongTest () {
        assertEquals(0, calculator.sum(-2147483647, 2147483647));
    }

    @Test
    @DisplayName("Addition with Double")
    public void sumDoubleTest() {
        assertEquals(24.2 , calculator.sum(12.1,12.1));

    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Bye-Bye");
    }
}
