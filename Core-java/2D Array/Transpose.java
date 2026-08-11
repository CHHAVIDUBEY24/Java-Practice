import java.util.Arrays;

public class Transpose {
    public static void swap(int[][] arr,int i, int j)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public static void transpose(int[][] arr){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(j>i)
                {
                    swap(arr,i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Original Array:" +Arrays.deepToString(arr));
        transpose(arr);
        System.out.println("Transposed Array:" +Arrays.deepToString(arr));
    }
}
