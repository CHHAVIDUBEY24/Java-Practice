package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceOfInt {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        ArrayList<List<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();
        subsequence(nums,ls,0,ans);
    }
    public static ArrayList<List<Integer>> subsequence(int[] nums,ArrayList<Integer> ls,int ind,ArrayList<List<Integer>> ans)
    {

        if(ind==nums.length)
        {
            return ans;
        }
        ls.add(nums[ind]);
        subsequence(nums, ls, ind+1,ans);
        ans.add(ls);
        ls.remove(nums[ind]);
        
        subsequence(nums, ls, ind+1,ans);
        ans.add(ls);

        return ans;
    }
    
}
