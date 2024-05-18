package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class DependsOnGroups {
    @Test(groups = {"Pro"})
    public void Test1(){
        System.out.println("Test -1");
    }
    @Test(dependsOnGroups = {"Pro"})
    public void Test2(){
        System.out.println("Test -2");
    }
}
