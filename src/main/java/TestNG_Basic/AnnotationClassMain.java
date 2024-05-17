package TestNG_Basic;

import org.testng.annotations.*;

public class AnnotationClassMain {
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before Test");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("After Test");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("After class");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }
    @BeforeGroups("Sanity")
    public void BeforeGroups(){
        System.out.println("Before Groups");
    }
    @AfterGroups("Sanity")
    public void AfterGroups(){
        System.out.println("After Groups");
    }
}
