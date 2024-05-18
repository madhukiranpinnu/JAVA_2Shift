package TestNG_Basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationDemo1 {
    @Parameters({"name"})
    @Test
    public void ParameterDemoTestLevel(String name){
        System.out.println(name);
    }
    @Parameters({"nameSuite"})
    @Test
    public void ParameterDemoSuiteLevel(String name){
        System.out.println(name);
    }

}
