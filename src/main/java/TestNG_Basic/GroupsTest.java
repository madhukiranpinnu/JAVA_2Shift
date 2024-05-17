package TestNG_Basic;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
    @BeforeGroups("IT Department")
    public void before_it()
    {
        System.out.println("This method will be executed before the execution of IT Department group");
    }
    @Test(groups= {"IT Department"})
    public void testcase2()
    {
        System.out.println("Software Developer");
    }
}
