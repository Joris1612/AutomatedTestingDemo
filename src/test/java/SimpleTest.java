import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {

    @Test
    public void TestAddition(){
        Calculator calc = new Calculator();
        int num = calc.Addition(5, 5);
        int result = 10;
        assertEquals(result, num);
    }
}
