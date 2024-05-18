package TestNG_Basic.GroupsDemo;

import org.testng.annotations.Test;

public class Program2 {
    @Test(groups = {"group1"})
    public void Test5(){
        System.out.println("Test 5 Grp 1");
    }
    @Test(groups = {"group2"})
    public void Test6(){
        System.out.println("Test 6 Grp 2");
    }
    @Test(groups = {"group1"})
    public void Test7(){
        System.out.println("Test 7 grp 1");
    }
    @Test(groups = {"group2"})
    public void Test8(){
        System.out.println("Test 8 grp 2");
    }
}
