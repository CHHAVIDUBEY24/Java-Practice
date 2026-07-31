import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[])
    {
        int arr[]={5,6,0,1,2,3,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int maxIndex=maxIndex(arr,0,n-i-1);
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static int maxIndex(int arr[],int start,int end)
    {
        int maxIndex=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>arr[maxIndex])
            {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
