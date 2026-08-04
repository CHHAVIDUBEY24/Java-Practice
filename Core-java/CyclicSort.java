import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3,7,8,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr)
    {
        int i=0;
        int n=arr.length;
        while(i<n)
        {
            int correctInd=arr[i]-1;
            if(arr[i]!=arr[correctInd])
            {
                swap(arr,i,correctInd);
            }
            else{
            i++;
            }

        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
