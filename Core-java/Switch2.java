import java.util.*;
public class Switch2 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("****Welcome****");
        System.out.println("1. English");
        System.out.println("2. Hindi");
        System.out.println("3. Science");

        System.out.println("Enter your option");
        int option=sc.nextInt();

        switch(option)
        {
            case 1:
                {
                    System.out.println("Write in English");
                    break;
                }
            case 2:
                {
                    System.out.println("Read in Hindi");
                    break;
                }
            case 3:
                {
                    System.out.println("Study Science");
                    break;
                }
            default:
                {
                    System.out.println("Invalid entry");
                }
        }
    }
}
