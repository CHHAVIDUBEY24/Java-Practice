import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int arr[]={5,4,6,3,2,1};
        mergeSortInplace(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
       
    }
    public static void mergeSortInplace(int[] arr,int s,int e)
    {
        int mid=s+(e-s)/2;
        if(s>=e)
        {
            return;
        }
        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr,mid+1,e);

        mergeInplace(arr,s,mid,e);
    }
    public static void mergeInplace(int[] arr,int s,int m,int e)
    {
        int i=s;
        int j=m+1;
        int[] ans=new int[e-s+1];
        int k=0;
        while(i<=m && j<=e)
        {
            if(arr[i]<=arr[j])
            {
                ans[k++]=arr[i++];
            }
            else
            {
                ans[k++]=arr[j++];
            }
        }
        while(i<=m)
        {
            ans[k++]=arr[i++];
        }
        while (j<=e) {
            ans[k++]=arr[j++];
        }
        for(int l=0;l<ans.length;l++)
        {
            arr[s+l]=ans[l];
        }

    
}
}

        
    
