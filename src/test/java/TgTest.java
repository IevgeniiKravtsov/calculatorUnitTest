import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class TgTest {

    @ParameterizedTest
    @CsvFileSource(resources = "trigonometric.csv")
    @DisplayName("Tangent")
    // some mistake in formula
    public void tgTest(double degree, double sinus, double cosine, double tangent, double cotangent, Calculator calculator) {
        assertEquals(tangent, calculator.tg(Math.toRadians(degree)), 0.0001);
    }
}
