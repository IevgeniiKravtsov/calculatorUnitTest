import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
@ExtendWith(CalculatorParameterResolver.class)
public class SinTest {

    @ParameterizedTest
    @CsvFileSource(resources = "trigonometric.csv")
    @DisplayName("Sinus")
    public void sinTest(double degree, double sinus, double cosine, double tangent, double cotangent, Calculator calculator){
        assertEquals(sinus, calculator.sin(Math.toRadians(degree)),0.0001);
    }
}
