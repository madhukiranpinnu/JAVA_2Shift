package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class GrPOneonOne {
    @Test(groups = {"one"})
    public void Test1(){
        System.out.println("Test -1");
    }
    @Test(groups = {"two"})
    public void Test2(){
        System.out.println("Test -2");
    }
    @Test(groups = {"three"})
    public void Test3(){
        System.out.println("Test -3");
    }
}
