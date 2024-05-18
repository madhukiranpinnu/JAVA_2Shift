package TestNG_Basic;

import org.testng.annotations.Test;

public class PriorityDemo {
    @Test(priority = 1)
    public void Test1(){
        System.out.println("Priority 1");
    }
    @Test(priority = 2)
    public void Test2(){
        System.out.println("Priority 2");
    }
    @Test(priority = 3)
    public void Test3(){
        System.out.println("Priority 3");
    }
    @Test(priority = 4)
    public void Test4(){
        System.out.println("Priority 4");
    }
    @Test(priority = -1)
    public void Test5(){
        System.out.println("Priority Negetive");
    }
}
