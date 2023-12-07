package junit5.testSuite;

import org.junit.platform.suite.api.*;

@Suite
@SelectPackages({"junit5.packageA"})
@ExcludePackages("^.*ClassA.*$")
public class JUnit5TestSuite2 {
}
