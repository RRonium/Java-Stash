import java.util.*;
public class VowelsArr
{
   void check(String str, char ch)
   {
       int flag=0;
       char fr[] = str.toCharArray();
       for(int i=0;i<str.length();i++)
       {
           if(fr[i]==ch)
           {
               flag++;
           }
       }
       System.out.println("Number of "+ch+" present: "+flag);
   }
   void check(String s1)
   {
        char[] vow = s1.toCharArray(); 
        for(int i=0;i<s1.length();i++)
        {
            switch(vow[i])
            {
                case 'a':
                    System.out.print("a ");
                    break;
                case 'e':
                    System.out.print("e ");
                    break;
                case 'i':
                    System.out.print("i ");
                    break;
                case 'o':
                    System.out.print("o ");
                    break;
                case 'u':
                    System.out.print("u ");
                    break;
                case 'A':
                    System.out.print("A ");
                    break;
                case 'E':
                    System.out.print("E ");
                    break;
                case 'I':
                    System.out.print("I ");
                    break;
                case 'O':
                    System.out.print("O ");
                    break;
                case 'U':
                    System.out.print("U ");
                    break;                   
           }
        }
   }
   public static void main(String args[])
   {
       Scanner sc =new Scanner(System.in);
       VowelsArr obj =new VowelsArr();
       System.out.println("Enter 1 or 2: ");
       int c = sc.nextInt();
       if(c==1)
       {
           System.out.println("Please type a sentence:");
           String str = sc.next();
           System.out.println("Please type the character whose frequency you want to find: ");
           char ch = sc.next().charAt(0);
           obj.check(str,ch);
       }
       else if(c==2)
       {
           System.out.println("Please type a sentence:");
           String s1 = sc.next();
           obj.check(s1);
       }
       else
       {
           System.out.println("INVALID");
       }
   }
}
