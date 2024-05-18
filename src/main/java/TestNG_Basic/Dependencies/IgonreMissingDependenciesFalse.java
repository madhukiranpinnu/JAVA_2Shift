package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class IgonreMissingDependenciesFalse {
    @Test
    public void Test1(){
        System.out.println("Test -1 ");
    }
    @Test(dependsOnMethods = {"Test1"},ignoreMissingDependencies = false)
    public void Test2(){
        System.out.println("Test 2");
    }
}
