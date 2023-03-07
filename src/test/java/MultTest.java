import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultTest {
    Calculator calculator;

    @BeforeEach
    public void beforeTest() {
        calculator = new Calculator();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "multLong.csv", delimiter = ',')
    @DisplayName("Multiplication with Long")
    public void multLongTest(long result, long a, long b) {
        assertEquals(result, calculator.mult(a, b));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "multDouble.csv")
    @DisplayName("Multiplication with Double")
    // Round result
    public void multDoubleTest(double result, double a, double b) {
        assertEquals(result, calculator.mult(a, b));
    }

}
