package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class AlwaysrunFalse {
    @Test(groups = {"Fog"})
    public void Test1(){
        System.out.println("Test1");
        System.out.println(5/0);
    }
    @Test(dependsOnGroups = {"Fog"},alwaysRun = false)
    public void Test2(){
        System.out.println("Test2");
    }
}
