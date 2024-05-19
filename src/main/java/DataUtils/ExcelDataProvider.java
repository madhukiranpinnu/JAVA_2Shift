package DataUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelDataProvider {
    @DataProvider(name = "DataSet")
    public Object[][] DataProvider() throws IOException {
      File file=new File(System.getProperty("user.dir")+"/Excels/TestdataHere.xlsx");
        FileInputStream fileInputStream=new FileInputStream(file);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet=xssfWorkbook.getSheet("DataSet");
        int rowNum=xssfSheet.getLastRowNum();
        int cellNum=xssfSheet.getRow(0).getLastCellNum();
        Object[][] data=new Object[rowNum][1];
        HashMap<String,String> map=null;
        for(int i=1;i<=rowNum;i++){
            map=new HashMap<>();
            for (int j=0;j<cellNum;j++){
                String  key=xssfSheet.getRow(0).getCell(j).getStringCellValue();
                String  value=xssfSheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key,value);
            }
            data[i-1][0]=map;
        }
        return data;
    }
    @Test(dataProvider = "DataSet")
    public void Test1(Map<String,String> map) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys(map.get("Username"));
        driver.findElement(By.name("password")).sendKeys(map.get("Password"));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
    }
}
