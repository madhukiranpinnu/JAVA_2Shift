package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class DependencyFailed {
    @Test
    public void Test1(){
        System.out.println("Test 1 failed");
        throw new RuntimeException("Failed");
    }
    @Test(dependsOnMethods = {"Test1"})
    public void Test2(){
        System.out.println("Test 2");
    }
}
