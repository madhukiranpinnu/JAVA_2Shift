package TestNG_Basic;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsBassic {
    @Test
    public void Test1(){
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(10,23,"Both are not same");
        softAssert.assertEquals(10,10,"Both are not equal");
        softAssert.assertNull(null,"Not null");
        softAssert.assertNotNull(null,"Not null");
        softAssert.assertEquals(10,45,"not same");
        softAssert.assertAll();
    }
}
