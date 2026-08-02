public class Two
{
    public static void main(String[] args) {
        int n=1234;
        int ans=digit(n);
        System.out.println(ans);
    }
    public static int digit(int n)
    {
        if(n==1) return 1;
        return n%10+digit(n/10);
    }
}