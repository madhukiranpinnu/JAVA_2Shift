package TestNG_Basic.DataProviderExamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program4 {
    @Test(dataProvider = "hjhj")
    public void Test2(Integer io){
        System.out.println(io);
    }
    @DataProvider(name = "hjhj")
    public Iterator<Integer> DataProviderTest(){
        List<Integer> lis=new ArrayList<>();
        lis.add(34);
        lis.add(78);
        lis.add(70);
        return lis.iterator();
    }
}
