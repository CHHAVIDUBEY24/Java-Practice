public class SnakePattern
{
    public static void printArr(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
            System.out.print(arr[i][j]+" ");
            }
             System.out.println();
        }   
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},{5,6,7},{9,1,2}};
        System.out.println("Your entered matrix is:");
        printArr(arr);
        snakePattern(arr);
        System.out.println();
        snakePattern2(arr);
    }
    public static void snakePattern(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            else
            {
                for(int j=arr[i].length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

     public static void snakePattern2(int[][] arr)
    {
        for(int i=0;i<arr[0].length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr.length;j++)
                {
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
            else
            {
                for(int j=arr.length-1;j>=0;j--)
                {
                    System.out.print(arr[j][i]+" ");
                }
                System.out.println();
            }
        }
    }

}