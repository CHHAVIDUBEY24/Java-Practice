import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args)
    {
        int arr[]={5,6,0,1,2,3,4,9,0,3,4,5,6,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            boolean swapped=false;
            for(int j=1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        
    }
}
