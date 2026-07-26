class SearchInSortedMatrix
{
    public static void main(String[] args)
    {
        int arr[][]={
            {10,20,30},{15,25,35},{28,30,45}
        };
        int ans[]=search(arr,30);
        System.out.println(ans[0]+" "+ans[1]);
    }
    public static int[] search(int arr[][],int target)
    {
        int r=0;
        int c=arr[0].length-1;
        while(r<arr.length && c>=0)
        {
            if(arr[r][c]==target)
            {
                return new int[]{r,c};
            }
            else if(arr[r][c]>target)
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}