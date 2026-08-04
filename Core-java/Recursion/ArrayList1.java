package Recursion;
import java.util.*;

public class ArrayList1 {
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5,3,1,3,3};
        ArrayList<Integer> list = new ArrayList<>();
        int n=arr.length;
        int target=3;
        Answer(arr,0,target,list);
        System.out.println(list);
    }
    public static ArrayList<Integer> Answer(int[] arr,int ind,int target,ArrayList<Integer> list)
    {
        if(ind==arr.length)
        {
            return list;
        }
        if(arr[ind]==target)
        {
            list.add(ind);
        }
        return Answer(arr, ind+1, target, list);

    }
    
}
