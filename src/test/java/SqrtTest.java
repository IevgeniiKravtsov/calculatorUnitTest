import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class SqrtTest {

    @ParameterizedTest
    @CsvSource({"16.0,4", "1,1","0.0,00.000", "-9,3", "36, -6", "0.1, 0.3162"})
    // possible to deal sqrt with negative numbers
    @DisplayName("Square root")
    public void sqrtTest(double a, double result, Calculator calculator){
        assertEquals(result, calculator.sqrt(a),0.0001);
    }
}
