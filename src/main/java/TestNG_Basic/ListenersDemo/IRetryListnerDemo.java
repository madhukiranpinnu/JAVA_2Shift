package TestNG_Basic.ListenersDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryListnerDemo implements IRetryAnalyzer {
    private int initial=0;
    private static int finalcount=3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if (initial<=finalcount){
            initial++;
            return true;
        }
        return false;
    }
}
