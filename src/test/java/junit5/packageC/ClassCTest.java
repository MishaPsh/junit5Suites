package junit5.packageC;

import junit5.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassCTest {
    Calc calc = new Calc();
    @Test
    void testMethodC(){
        Assertions.assertEquals(10,calc.multiply(5,2));
    }
}
