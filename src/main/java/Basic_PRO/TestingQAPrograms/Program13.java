package Basic_PRO.TestingQAPrograms;

public class Program13 {
    public static void main(String[] args) {
        //firstletter of each word in caps
        String inputString="madhu kiran pinnu";
        String[] strings=inputString.split(" ");
        String output="";
        for(String string:strings){
            char[] temp=string.toCharArray();
            for(int i=0;i<temp.length;i++){
                if(i==0){
                    temp[i]= (char) (temp[i]-32);
                }
            }
            String tempStr=new String(temp);
            output=output+" "+tempStr;
        }
        System.out.println(output);
    }
}
