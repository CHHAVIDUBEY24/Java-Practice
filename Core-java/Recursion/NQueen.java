import java.util.ArrayList;
public class NQueen {
public static boolean isValid(char[][] board,int i,int j)
{
    for(int k=0;k<i;k++)
    {
        if(board[k][j]=='Q')
        {
            return false;
        }
    }
    for(int l=0;l<j;l++)
    {
        if(board[i][l]=='Q')
        {
            return false;
        }
    }
    int a=i-1;
    int b=j-1;
    while(a>=0 && b>=0)
    {
        if(board[a][b]=='Q')
        {
            return false;
        }
        a--;
        b--;
    }
    int c=i-1;
    int d=j+1;

    while(c>=0 && d<board.length)
    {
        if(board[c][d]=='Q')
            return false;
        c--;
        d++;
    }
     return true;

}

public static void helper(char[][]board,int i,ArrayList<ArrayList<String>> ans,ArrayList<String> res)
{
    int n=board.length;
    if(i==n)
    {
        ans.add(new ArrayList<>(res));
        return;
    }

    for(int k=0;k<board.length;k++)
    {
    if(isValid(board,i,k))
    {
        board[i][k]='Q';
        res.add(new String(board[i]));
        helper(board, i+1, ans, res);
        res.remove(res.size()-1);
        board[i][k]='.';
    }
}
}

    public static void main(String[] args) {

        char [][] board={{'.','.','.','.'},
                        {'.','.','.','.'},
                        {'.','.','.','.'},
                        {'.','.','.','.'}};

        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        ArrayList<String> res=new ArrayList<>();
        helper(board,0,ans,res);
        for(ArrayList<String> i:ans)
        {
            System.out.print(i);
        }
        System.out.println();
    }
}
