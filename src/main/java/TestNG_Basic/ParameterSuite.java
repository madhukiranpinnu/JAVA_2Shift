package TestNG_Basic;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterSuite {
    @Parameters("naam")
    @Test
    public void TestSuiteParameter(String naam){
        System.out.println(naam);
    }
    @Test
    @Parameters("opopo")
    public void Optional(@Optional("kok") String name){
        System.out.println(name);
    }
}
