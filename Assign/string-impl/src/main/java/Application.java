import java.util.Scanner;

public class Application {

    public static void main(String args[])
    {
        StringFunctions ss=new StringFunctions();
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter String :");
        String s=ob.nextLine();
        System.out.println("reverse of String :"+ss.reverseString(s));
        System.out.println("Length of String " +ss.length(s));

    }
}