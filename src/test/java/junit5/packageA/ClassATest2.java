package junit5.packageA;

import junit5.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassATest2 {
    Calc calc = new Calc();
    @Test
    void testMethod2(){
        Assertions.assertEquals(7,calc.subtract(9,2));
    }
}
