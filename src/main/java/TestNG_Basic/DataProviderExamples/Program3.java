package TestNG_Basic.DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program3 {
    //Single Dimension dataprovider
    @Test(dataProvider = "DataproviderTest")
    public void Test1(String name){
        System.out.println(name);
    }
    @DataProvider
    public Iterator<String> DataproviderTest(){
        List<String> list=new ArrayList<>();
        list.add("Madhu");
        list.add("kiran");
        list.add("pinnu");
        return list.iterator();
    }
}
