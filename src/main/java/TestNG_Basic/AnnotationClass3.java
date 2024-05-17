package TestNG_Basic;

import org.testng.annotations.Test;

public class AnnotationClass3 extends AnnotationClassMain{
    @Test
    public void Test1Class3(){
        System.out.println("Test1Class3");
    }
    @Test(groups = {"Sanity"})
    public void Test2Class3(){
        System.out.println("Test1Class3");
    }
}
