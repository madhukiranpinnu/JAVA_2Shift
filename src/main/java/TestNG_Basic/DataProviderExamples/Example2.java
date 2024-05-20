package TestNG_Basic.DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example2 {
    @Test(dataProvider = "DataProviderTest")
    public void Test1(String user,String pass){
        System.out.println(user);
        System.out.println(pass);
    }
    @DataProvider
    public Object[][] DataProviderTest(){
        Object[][] obj=new Object[2][2];
        obj[0][0]="Madhu";
        obj[0][1]="Pass";
        obj[1][0]="Kiran";
        obj[1][1]="Pass1";
        return obj;
    }
}
