package TestNG_Basic.DataProviderExamples;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviderData {
    @DataProvider(name = "KLOd")
    public Iterator<String> DataProvider(){
       List<String> strings=new ArrayList<>();
       strings.add("madhu");
       strings.add("kiran");
       strings.add("pinnu");
      return strings.iterator();
    }
}
