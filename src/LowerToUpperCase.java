import java.util.Scanner;

public class LowerToUpperCase {

    public static void main(String[] args)
    {

        Scanner myObj=new Scanner(System.in);
        System.out.print("Enter the String:");

        String string=myObj.nextLine();

        System.out.println("The entered String is:"+string);

        String upperCase = string.toUpperCase(); //toUpperCase return lowercase of String

        System.out.println("The upper case of string is:"+upperCase);


    }





}
