import java.util.*;
public class SortRec
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(2,3,4,1,5));
        sortRec(arr);
        System.out.println(arr);
    }
    public static void sortRec(ArrayList<Integer>arr)
    {
        if(arr.size()==1)
        {
            return;
        }
        int temp=arr.get(arr.size()-1);
        arr.remove(arr.get(arr.size()-1));
        sortRec(arr);
        insertRec(arr,temp);

    }
    public static void insertRec(ArrayList<Integer>arr,int temp)
    {
        if(arr.size()== 0 || arr.get(arr.size()-1)<=temp)
        {
            arr.add(temp);
            return;
        }
        int val=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insertRec(arr,temp);
        arr.add(val);
    }

}