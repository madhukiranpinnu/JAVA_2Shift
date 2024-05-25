package TestNG_Basic.ListenersDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Type1 {
    @Test
    public void Test1(){
        System.out.println("Test 1 started");
    }
    @Test(retryAnalyzer = IRetryListnerDemo.class)
    public void Test2(){
        System.out.println(5/0);
        System.out.println("Test 2 started");
    }
    @Test
    public void Test3(){
        System.out.println("Test 3 started");
        throw new SkipException("Skipped");
    }
}
