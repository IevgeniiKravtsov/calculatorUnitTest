import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class IsNegativeTest {

    @ParameterizedTest
    @CsvSource({"1, false", "0, false","-1, true", "10, false", "-2, true", "-1234, true"})
    @DisplayName("Is negative")
    public void isNegativeTest(long a, boolean result, Calculator calculator)    {
        assertEquals(result, calculator.isNegative(a));
    }
}
