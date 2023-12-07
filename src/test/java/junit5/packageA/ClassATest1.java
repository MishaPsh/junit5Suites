package junit5.packageA;

import junit5.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassATest1 {
    Calc calc = new Calc();
    @Test
    public void testMethodA(){
        Assertions.assertEquals(4,calc.add(2,2));
    }
}