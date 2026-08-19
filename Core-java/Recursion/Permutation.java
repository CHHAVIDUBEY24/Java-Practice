import java.util.*;
public class Permutation
{
    public static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void helper(int[] arr,int ind ,ArrayList<ArrayList<Integer>> ans)
    {
        int n=arr.length;
        if(ind==n)
        {
            ArrayList<Integer> curr=new ArrayList<>();
            for(int num:arr)
            {
                curr.add(num);
            }
            ans.add(new ArrayList<>(curr));
            return;                                        
        }
        for(int i=ind;i<n;i++)
        {
            swap(arr,i,ind);
            helper(arr, ind+1, ans);
            swap(arr,i,ind);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
       
        helper(arr,0,ans);
        for(ArrayList<Integer> ls: ans)
        {
            System.out.println(ls);
        }
    }
}