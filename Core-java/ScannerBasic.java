import java.util.*;
public class ScannerBasic{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double num=sc.nextDouble();
        System.out.println("You entered:"+num);

        sc.nextLine();//to consume the newline character after nextDouble()//
        System.out.println("Enter your name");

        String name=sc.nextLine();

        System.out.println("Your entered name:"+name);
        //nextLine() method is used to read the whole line of input including spces until the next line//
        //next() is used to read the first word of the input//
    }
}