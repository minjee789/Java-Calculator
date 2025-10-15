import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {
    AdvancedCalculator advancedCalc;

    @BeforeEach
    void setUp() {
        advancedCalc = new AdvancedCalculator();
        advancedCalc.setNumbers(9, 3);
    }

    @Test
    void multiply() {
        assertEquals(0, advancedCalc.multiply());
        assertEquals(0, advancedCalc.divide());
    }

    @Test
    void divide() {
        assertEquals(0, advancedCalc.divide());
    }
}
//유닛테스트 = 사용자가 반드시 사용하는 행위가 대상