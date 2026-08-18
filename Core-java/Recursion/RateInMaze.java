import java.util.ArrayList;

public class RateInMaze {

    public static boolean isUp(int[][] maze,int i,int j)
    {
        if(i>0 && maze[i-1][j]==1)
        {
            return true;
        }
        return false;
    }
    public static boolean isDown(int[][] maze,int i,int j)
    {
        if(i<maze.length-1 && maze[i+1][j]==1)
        {
            return true;
        }
        return false;
    }
    public static boolean isLeft(int[][] maze,int i,int j)
    {
        if(j>0 && maze[i][j-1]==1)
        {
            return true;
        }
        return false;
    }
    public static boolean isRight(int[][] maze,int i,int j)
    {
        if(j<maze[0].length-1 && maze[i][j+1]==1)
        {
            return true;
        }
        return false;
    }

    
    public static void helper(int[][]maze,int i,int j,String path,ArrayList<String> ans)
    {
        if(i==maze.length-1 && j == maze[0].length-1)
        {
            ans.add(path);
            return;
        }
        
        maze[i][j]=0;

        if(isUp(maze,i,j))
        {  
            helper(maze, i-1, j, path+'U', ans);
        }
         if(isDown(maze,i,j))
        { 
            helper(maze, i+1, j, path+'D', ans);
        }
         if(isRight(maze,i,j))
        {
            
            helper(maze, i, j+1, path+'R', ans);
        }
         if(isLeft(maze,i,j))
        {
            
            helper(maze, i, j-1, path+'L', ans);
        }
        maze[i][j]=1;


    }
    public static void main(String[] args) {
        int[][] maze={{1,0,0,0},{1,1,1,0},{0,1,1,1},{0,1,1,1}};
        ArrayList<String> ans=new ArrayList<>();
        String path="";
        helper(maze,0,0,path,ans);
        for(String i : ans)
        {
            System.out.print("["+i+"]"+" ");
            
        }
        System.out.println();
    }
}
