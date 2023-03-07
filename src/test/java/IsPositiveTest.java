import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class IsPositiveTest {

    @ParameterizedTest
    @CsvSource({"1,true", "0,false","-1, false", "10,true", "-2, false", "-1234, false"})
    @DisplayName("Is positive")
    //
    public void isPositiveTest(long a, boolean result, Calculator calculator)    {
        assertEquals(result, calculator.isPositive(a));
    }
}
