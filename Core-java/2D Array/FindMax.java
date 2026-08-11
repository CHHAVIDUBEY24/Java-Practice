import java.util.Scanner;

public class FindMax
{
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        Scanner sc=new Scanner(System.in);
        int maxEle=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nYour Entered Matrix:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[0].length ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(maxEle < arr[i][j])
                {
                    maxEle=arr[i][j];
                }
            }
        }
        System.out.println(maxEle);
        sc.close();
    }
}