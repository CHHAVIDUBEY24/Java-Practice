import java.util.Scanner;
public class ArrayBasics {
    public static void main(String[] args) {
        //arrays are mutable//
       int[] arr={1,2,3,4,5};
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        double num=sc.nextDouble();
         
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        int[] arr1=new int[5];//5 size ka array banaya//
        arr1[0]=1;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=4;
        arr1[4]=5;
        
        System.out.println(arr1[0]);
        
    }
}