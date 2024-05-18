package TestNG_Basic.GroupsDemo;

import org.testng.annotations.Test;

public class Program1 {
    @Test(groups = {"group1"})
    public void Test1(){
        System.out.println("Test 1 Grp 1");
    }
    @Test(groups = {"group2"})
    public void Test2(){
        System.out.println("Test 2 Grp 2");
    }
    @Test(groups = {"group1"})
    public void Test3(){
        System.out.println("Test 3 grp 1");
    }
    @Test(groups = {"group2"})
    public void Test4(){
        System.out.println("Test 4 grp 2");
    }
}
