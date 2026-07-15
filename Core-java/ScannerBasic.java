import java.util.*;
public class ScannerBasic{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double num=sc.nextDouble();
        System.out.println("You entered:"+num);
    }
}