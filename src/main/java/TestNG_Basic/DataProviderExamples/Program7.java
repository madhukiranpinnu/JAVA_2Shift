package TestNG_Basic.DataProviderExamples;

import org.testng.annotations.Test;

public class Program7 {
    @Test(dataProvider = "KLOd",dataProviderClass = DataProviderData.class)
    public void Test1(String name){
        System.out.println(name);
    }
}
