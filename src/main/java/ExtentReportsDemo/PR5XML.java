package ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PR5XML {
    public static void main(String[] args) throws IOException {
        ExtentReports extentReports=new ExtentReports();
        ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program5.html"));
        extentReports.attachReporter(extentSparkReporter);
        ExtentTest test=extentReports.createTest("Test 1");
        String xml="<breakfast_menu>\n" +
                "<food>\n" +
                "<name>Belgian Waffles</name>\n" +
                "<price>$5.95</price>\n" +
                "<description>Two of our famous Belgian Waffles with plenty of real maple syrup</description>\n" +
                "<calories>650</calories>\n" +
                "</food>\n" +
                "<food>\n" +
                "<name>Strawberry Belgian Waffles</name>\n" +
                "<price>$7.95</price>\n" +
                "<description>Light Belgian waffles covered with strawberries and whipped cream</description>\n" +
                "<calories>900</calories>\n" +
                "</food>\n" +
                "<food>\n" +
                "<name>Berry-Berry Belgian Waffles</name>\n" +
                "<price>$8.95</price>\n" +
                "<description>Light Belgian waffles covered with an assortment of fresh berries and whipped cream</description>\n" +
                "<calories>900</calories>\n" +
                "</food>\n" +
                "<food>\n" +
                "<name>French Toast</name>\n" +
                "<price>$4.50</price>\n" +
                "<description>Thick slices made from our homemade sourdough bread</description>\n" +
                "<calories>600</calories>\n" +
                "</food>\n" +
                "<food>\n" +
                "<name>Homestyle Breakfast</name>\n" +
                "<price>$6.95</price>\n" +
                "<description>Two eggs, bacon or sausage, toast, and our ever-popular hash browns</description>\n" +
                "<calories>950</calories>\n" +
                "</food>\n" +
                "</breakfast_menu>";
        test.log(Status.FAIL,xml);
        String json="{\n" +
                "    \"glossary\": {\n" +
                "        \"title\": \"example glossary\",\n" +
                "\t\t\"GlossDiv\": {\n" +
                "            \"title\": \"S\",\n" +
                "\t\t\t\"GlossList\": {\n" +
                "                \"GlossEntry\": {\n" +
                "                    \"ID\": \"SGML\",\n" +
                "\t\t\t\t\t\"SortAs\": \"SGML\",\n" +
                "\t\t\t\t\t\"GlossTerm\": \"Standard Generalized Markup Language\",\n" +
                "\t\t\t\t\t\"Acronym\": \"SGML\",\n" +
                "\t\t\t\t\t\"Abbrev\": \"ISO 8879:1986\",\n" +
                "\t\t\t\t\t\"GlossDef\": {\n" +
                "                        \"para\": \"A meta-markup language, used to create markup languages such as DocBook.\",\n" +
                "\t\t\t\t\t\t\"GlossSeeAlso\": [\"GML\", \"XML\"]\n" +
                "                    },\n" +
                "\t\t\t\t\t\"GlossSee\": \"markup\"\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}\n";
        test.log(Status.FAIL,json);
        extentReports.flush();
        Desktop.getDesktop().browse(new File(System.getProperty("user.dir")+"/src/main/java/ExtentReportsDemo/Reports/Program5.html").toURI());
    }
}
