import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleTest {

    @Test
    public void TestAddition(){
        Calculator calc = new Calculator();
        int num = calc.Addition(5, 5);
        int result = 10;
        assertEquals(result, num);
    }
}
