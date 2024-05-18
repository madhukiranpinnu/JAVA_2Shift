package TestNG_Basic.Dependencies;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreMissingDependenciesT {
    @Ignore
    @Test
    public void Test1(){
        System.out.println("Test 1");
    }
    @Test(dependsOnMethods = {"Test1"},ignoreMissingDependencies = true)
    public void Test2(){
        System.out.println("Test 2");
    }
}
