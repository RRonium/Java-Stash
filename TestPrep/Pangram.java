import java.util.*;
class Pangram
{
    static boolean isPangram(String str)
    {
        String w[]=str.split(" ");
        char alpha[] ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<w.length;i++)
        {
            for(int j=0;j<w[i].length();j++)
            {
                for(int c=0;c<alpha.length;c++)
                {
                    if(w[i].charAt(j)==alpha[c])
                    {
                        alpha[c]='*';
                        break;
                    }
                }
            }
        }
        for(int i=0;i<alpha.length;i++)
        {
            if(alpha[i]!='*')
                return false;          
        }
        return true;
    }
    static void word(String str)
    {
        String w[]=str.split(" ");
        String max=w[0],min=w[0];
        for(int i=0;i<w.length;i++)
        {
            if(w[i].length()>max.length())
                max=w[i];
            if(w[i].length()<min.length())
                min=w[i];
            if(w[i].length()==max.length() || w[i].length()==min.length())
                continue;
        }
        System.out.println("Shortest: "+min+" || Longest: "+max);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String pls: ");
        String str=sc.nextLine();
        if(str.endsWith(".")==false || str.endsWith("?")==false || str.endsWith("!")==false)
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println("Is is a Pangram? : "+isPangram(str));
        word(str);
    }
}