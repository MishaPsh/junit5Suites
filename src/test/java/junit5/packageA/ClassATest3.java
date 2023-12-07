package junit5.packageA;

import junit5.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassATest3 {
    Calc calc = new Calc();
    @Test
    void testMethod3(){
        Assertions.assertEquals(9,calc.multiply(3,3));
    }
}
