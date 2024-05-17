package TestNG_Basic;

import org.testng.annotations.Test;

public class AnnotationsClass1 extends AnnotationClassMain {
    @Test
    public void Test1(){
        System.out.println("Test 1");
    }
    @Test(groups = {"Sanity"})
    public void Test2(){
        System.out.println("Test 2");
    }
}
