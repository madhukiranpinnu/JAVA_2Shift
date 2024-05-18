package TestNG_Basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleParameters {
    @Parameters({"king","queen"})
    @Test
    public void MP(String king,String queen){
        System.out.println(king+queen);
    }
}
