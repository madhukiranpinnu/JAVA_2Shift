package TestNG_Basic.Dependencies;

import org.testng.annotations.Test;

public class MultipleGroups {
    @Test(groups = {"Grp1"})
    public void Test1(){
        System.out.println("Test -1");
    }
    @Test(groups = "Grp2")
    public void Test2(){
        System.out.println("Test -2");
    }
    @Test(dependsOnGroups = {"Grp1","Grp2"})
    public void Reciever(){
        System.out.println("Rec");
    }
}
