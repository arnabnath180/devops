import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double delta=1e-15;
    Calculator cal=new Calculator();
    @Test
    public void addTest(){
        assertEquals("",7,cal.add(5,3),delta);
    }

}
