package TestNG_Basic.Dependencies;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoredFirstMethod {
    @Test
    @Ignore
    public void Test1(){
        System.out.println("Test 1");
    }
    @Test(dependsOnMethods = {"Test1"})
    public void Test2(){
        System.out.println("test2");
    }
}
