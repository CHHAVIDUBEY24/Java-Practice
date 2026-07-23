public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int target=4;
        int linearSearch=linearSearch(arr,target);
        System.out.println(linearSearch);
    }
    public static int linearSearch(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length==0)
            {
                return -1;
            }
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    
}