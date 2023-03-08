import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class CtgTest {

    @ParameterizedTest
    @CsvFileSource(resources = "trigonometric.csv")
    @DisplayName("Cotangent")
    // some mistake in formula
    public void ctgTest(double degree, double sinus, double cosine, double tangent, double cotangent, Calculator calculator) {
        assertEquals(cotangent, calculator.ctg(Math.toRadians(degree)), 0.0001);
    }
}
