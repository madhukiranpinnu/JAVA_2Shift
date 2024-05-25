package CucumberPractice.BasicFolder;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"D:/Goal/frame/JAVA_2Shift/src/main/java/CucumberPractice/BasicFolder/Program1.feature"}
        ,tags="@sanity")
public class TestRunnerClass {

}
