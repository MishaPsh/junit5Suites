package junit5.packageA.packageD;

import junit5.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassDTest {
    Calc calc = new Calc();
    @Test
    public void testMethodD(){
        Assertions.assertEquals(4,calc.add(2,2));
    }
}
