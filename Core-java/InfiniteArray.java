public class InfiniteArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7,8,8,9,10};
        System.out.println(infiniteArray(arr,9));
    }
    public static int infiniteArray(int arr[],int target)
    {
        int start=0;
        int end=1;
        while(end < arr.length &&target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int arr[],int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}