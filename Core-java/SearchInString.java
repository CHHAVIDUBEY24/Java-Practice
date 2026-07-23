public class SearchInString{
    public static void main(String[] args)
    {
        String str = "Hello World";
        char ch ='o';
        System.out.println(binarySearch(str,ch));
    }

    static boolean binarySearch(String str, char ch)
    {
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                return true;
            }
            
        }
        return false;
    }
}
