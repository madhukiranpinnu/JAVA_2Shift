package TestNG_Basic.TestNG1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
    @Ignore
    @Test
    public void Test1(){
        System.out.println("Test 1");
    }
}
