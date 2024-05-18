package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class Program1 {
    @Test
    public void Test1(){
        System.out.println("Test");
    }
    @Test(dependsOnMethods = {"Test1"})
    public void Test2(){
        System.out.println("Test2");
    }
}
