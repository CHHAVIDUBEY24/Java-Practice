public class One
{
    public static void main(String[] args)
    {
        int n=5;
        show(n);
    }
    public static void show(int n)
    {
        if(n==0)
        {
            return;
        }
        
        System.out.println(n);//n to 1
        show(n-1);
    }
}