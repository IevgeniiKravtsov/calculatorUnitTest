import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class PowTest {

    @ParameterizedTest
    @CsvSource({"12,2.0,144", "2,0,1","0.0,1,00.000", "-2,3,-8", "2.0, 2.5, 5.6568", "4, 0.5, 2"})
    @DisplayName("Raised to the power")
    // Round with second part of the power
    public void subDoubleTest(double a, double b, double result, Calculator calculator){
        assertEquals(result, calculator.pow(a,b),0.0001);
    }
}
