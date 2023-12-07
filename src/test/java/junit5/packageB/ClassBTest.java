package junit5.packageB;

import junit5.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
@Tag("dev")
public class ClassBTest {
    Calc calc = new Calc();
    @Test
    void testMethodB(){
        Assertions.assertEquals(2,calc.divide(4,2));
    }
}
