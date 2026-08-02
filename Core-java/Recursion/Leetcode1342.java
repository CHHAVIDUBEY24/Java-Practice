public class Leetcode1342
{
    public static void main(String[] args)
    {
        int n=1234;
        int ans=counter(n,0);
        System.out.println(ans);
    }
    public static int counter(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        if(n%2==0)
        {
            return counter(n/2,++c);
        }
        else 
        {
            return counter(n-1,++c);
        }
    }
}