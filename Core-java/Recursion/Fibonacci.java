package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans=fibonacci(6);
        System.out.println(ans);
    }
    public static int fibonacci(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        else
        {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
