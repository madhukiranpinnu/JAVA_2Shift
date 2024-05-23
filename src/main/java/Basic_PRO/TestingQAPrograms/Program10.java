package Basic_PRO.TestingQAPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program10 {
    public static void main(String[] args) {
        //To get start and end index of a string in a line
      String input="Java javaJava job";
      String matcher="Java";
        Pattern pattern=Pattern.compile(matcher);
        Matcher matcher1=pattern.matcher(input);
        int count=0;
        while (matcher1.find())
        {
            count++;
            System.out.println(matcher1.start()+"____________"+matcher1.end());
        }
    }
}
