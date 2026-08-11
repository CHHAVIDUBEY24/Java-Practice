import java.util.Arrays;

public class ReverseMatrix {
    

    public static void swap(int[][] arr,int i,int j,int k)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[i][k];
        arr[i][k]=temp;
    }
    public static void swap2(int[][] arr,int i,int j,int k)
    {
        int temp=arr[j][i];
        arr[j][i]=arr[k][i];
        arr[k][i]=temp;
    }

    public static void reverseMatrix(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int j=0;
            int k=arr[i].length-1;
            while(j<=k)
            {
                swap(arr,i,j,k);
                j++;
                k--;
            }
        }
    }

    public static void reverseMatrix2(int[][] arr)
    {
        for(int i=0;i<arr[0].length;i++)
        {
            int j=0;
            int k=arr.length-1;
            while(j<=k)
            {
                swap2(arr,i,j,k);
                j++;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Your Array:");
        System.out.println(Arrays.deepToString(arr));
        reverseMatrix(arr);
        System.out.println("Array after row reverse:");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Array after column reverse:");
        reverseMatrix2(arr);
        System.out.println(Arrays.deepToString(arr));
    }

}
