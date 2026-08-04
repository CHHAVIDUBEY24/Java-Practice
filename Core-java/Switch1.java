public class Switch1
{
    public static void main(String[] args)
    {
        switch(0)
        {
            case 1: 
            {
                System.out.println("Inside 1st block");
                break;
            }
            case 2:
                {
                    System.out.println("Inside 2nd block");
                    break;
                }
                default:
                    {
                        System.out.println("Inside the default block");
                    }
        }
    }
}