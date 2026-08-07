package Recursion;
import java.util.ArrayList;

public class SubsequenceOfChar
{
    public static void main(String[] args) {
        String s= "abc";
        ArrayList<String> ls=new ArrayList<>();
        ls=subsequence("",s,ls);
        System.out.println(ls);
    }
    public static ArrayList<String> subsequence(String p,String up,ArrayList<String> ls)
    {
        
        if(up.isEmpty())
        {
            ls.add(p);
            return ls;
        }

        char ch=up.charAt(0);


        subsequence(ch+p, up.substring(1), ls);

        return subsequence(p, up.substring(1), ls);
    }
}