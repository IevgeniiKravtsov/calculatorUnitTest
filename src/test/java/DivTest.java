import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivTest {
    Calculator calculator;

    @BeforeEach
    public void beforeTest() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "multLong.csv")
    @DisplayName("Division with Long")
    public void divLongTest(long result, long a, long b) {
        assertEquals(b, calculator.div(result,a));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "multDouble.csv")
    @DisplayName("Division with Double")
    // There is no validation on the attempt to divide by zero
    public void divDoubleTest(double result, double a, double b) {
        assertEquals(b, calculator.div(result,a), 0.00001);
    }
}
