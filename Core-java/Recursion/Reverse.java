public class Reverse
{
    public static void main(String[] args)
    {
        int n=1234000;
        
        int l=Integer.toString(n).length();
        int ans=reverseNo(n,l-1);
        System.out.println(ans);
    }
    public static int reverseNo(int n,int l)
    {
        if(n==0)
        {
            return 0;
        }
        return (n%10)*(int) Math.pow(10, l) + reverseNo(n/10,l-1);
    }
}