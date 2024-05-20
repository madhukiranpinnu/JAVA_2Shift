package TestNG_Basic.DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program5 {
    @Test(dataProvider = "Hloo")
    public void Test1(Object[] object){
        System.out.println(object[0]+"-------"+object[1]+"-------------"+object[2]);
    }
    @DataProvider(name = "Hloo")
    public Iterator<Object[]> DataProviderTest(){
        List<Object[]> list=new ArrayList<>();
        list.add(new Object[]{"madhu","kiran","pinnu"});
        list.add(new Object[]{"jkjk","kl","fghjk"});
        return list.iterator();
    }
}
