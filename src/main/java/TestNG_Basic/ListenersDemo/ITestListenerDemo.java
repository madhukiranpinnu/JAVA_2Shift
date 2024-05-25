package TestNG_Basic.ListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerDemo implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("This method has started"+result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("This method succeded"+result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("This method is failed "+result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("This method is skipped"+result.getName());
    }

    public void onStart(ITestContext context) {
        System.out.println("Suite is started"+context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("Suite is Fineshed"+context.getName());
    }
}
