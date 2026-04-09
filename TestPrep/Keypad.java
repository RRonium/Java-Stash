import java.util.*;
class Keypad
{    
    String str="";
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        str=sc.nextLine();
    }
    void calc()
    {
        char one[] ={'A','D','G','J','M','P','T','W'};       
        char two[] ={'B','E','H','K','N','Q','U','X'};
        char three[] ={'C','F','I','L','O','R','V','Y'};
        char four[] ={'S','Z'};
        int strokes=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<one.length;j++)
            {
                if(Character.toUpperCase(str.charAt(i))==one[j])
                    strokes+=1;                                    
            }
            for(int j=0;j<two.length;j++)
            {
                if(Character.toUpperCase(str.charAt(i))==one[j])
                    strokes+=2;                                    
            }
            for(int j=0;j<three.length;j++)
            {
                if(Character.toUpperCase(str.charAt(i))==one[j])
                    strokes+=3;                                    
            }
            for(int j=0;j<four.length;j++)
            {
                if(Character.toUpperCase(str.charAt(i))==one[j])
                    strokes+=4;                                    
            }
        }
        System.out.println("Number of keystrokes reqd. = "+strokes);
    }
    public static void main(String args[])
    {
        Keypad obj =new Keypad();
        obj.accept();
        obj.calc();
    }
}