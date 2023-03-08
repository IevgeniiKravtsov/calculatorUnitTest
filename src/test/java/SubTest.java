import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class SubTest {

    @Test
    @DisplayName("Subtraction with Long")
    public void subLongTest(Calculator calculator) {
        assertEquals(-1, calculator.sub(25, 26));
    }

    @ParameterizedTest
    @CsvSource({"10.0,12,2.0", "-2.15,2.15,4.3", "0.0,0,00.000"})
    @DisplayName("Subtraction with Double")
    public void subDoubleTest(double result, double a, double b, Calculator calculator) {
        assertEquals(result, calculator.sub(a, b));
    }

}
