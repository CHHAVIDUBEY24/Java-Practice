import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args) {
        int arr[]={5,6,7,1,2,3,9,4,8,0};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] mergeSort(int[] arr)
    {
        int mid=arr.length/2;
        if(arr.length==1)
        {
            return arr;
        }
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left,int[] right)
    {
        int i=0;
        int j=0;
        int k=0;
        int n=left.length;
        int m=right.length;

        int[] ans=new int[n+m];

        while(i<n && j<m)
        {
            if(left[i]<=right[j])
            {
                ans[k]=left[i];
                i++;
            }
            else
            {
                ans[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<n)
        {
            ans[k++]=left[i++];
        }
        while(j<m)
        {
            ans[k++]=right[j++];
        }
        return ans;
    }

    
}