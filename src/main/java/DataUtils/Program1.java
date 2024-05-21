package DataUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Program1 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        File file=new File(System.getProperty("user.dir")+"\\src\\main\\java\\Basic_PRO\\CollectionsPractice\\MapPractice\\PropertiesDemo\\Data.properties");
        FileInputStream fileInputStream=new FileInputStream(file);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties);
        properties.setProperty("Height","5.6");
        FileOutputStream fos=new FileOutputStream(file);
        properties.store(fos,"secret");
        System.out.println(properties);
    }
}
