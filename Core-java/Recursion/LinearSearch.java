package Recursion;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class LinearSearch {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        int ans=linearSearch(arr,0,6);
        System.out.println(ans);
    }
    public static int linearSearch(int[] arr,int ind,int target)
    {
        if(ind==arr.length)
        {
            return -1;
        }
        if(arr[ind]==target)
        {
            return ind;
        }
        return linearSearch(arr, ind+1, target);
    }
}
