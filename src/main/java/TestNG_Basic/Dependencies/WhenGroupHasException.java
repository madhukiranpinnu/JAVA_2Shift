package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class WhenGroupHasException {
    @Test(groups = {"jkl"})
    public void Test1(){
        System.out.println("Test 1");
        System.out.println(5/0);
    }
    @Test(dependsOnGroups = {"jkl"})
    public void Test2(){
        System.out.println("Test 2");
    }
}
