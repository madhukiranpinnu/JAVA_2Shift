package TestNG_Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
    @Test
    public void Test1(){
        System.out.println("Test 1 Failed");
        Assert.assertFalse(true);
    }
    @Test
    public void Test2(){
        System.out.println("Test 2 Passed");
        Assert.assertFalse(false);
    }
    @Test
    public void Test3(){
        System.out.println("Test 3 Passed");
        Assert.assertTrue(true);
    }
    @Test
    public void Test4(){
        System.out.println("Test 4 Failed");
        Assert.assertTrue(false);
    }
    @Test
    public void Test5(){
        System.out.println("Test 5 passed");
        Assert.assertFalse(true);
    }
    @Test
    public void Test6(){
        System.out.println("Test 6 failed");
        Assert.assertFalse(false);
    }
}
