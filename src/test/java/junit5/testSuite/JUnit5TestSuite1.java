package junit5.testSuite;

import junit5.packageA.ClassATest1;
import junit5.packageB.ClassBTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;




@Suite
@SelectClasses({ClassATest1.class, ClassBTest.class})
public class JUnit5TestSuite1 {
}
