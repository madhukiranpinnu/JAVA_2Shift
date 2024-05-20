package TestNG_Basic.DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program6 {
    @Test(dataProvider = "KLOD")
    public void Test1(String name){
        System.out.println(name);
    }
    @DataProvider(name = "KLOD",indices = {0,2})
    public Iterator<String> DataProvider(){
        List<String> list=new ArrayList<>();
        list.add("Madhu");
        list.add("Kiran");
        list.add("Pinnu");
        return list.iterator();
    }
}
