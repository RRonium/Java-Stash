import java.util.*;
class Apex1
{
    String str="",del="";
    int pos;
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        str=sc.nextLine();
        if(str.charAt(str.length()-1)!='.' && str.charAt(str.length()-2)!='!' && str.charAt(str.length()-1)!='?')
        {
            System.out.println("Invalid");
            System.exit(0);
        }
        System.out.println("Enter the word to be deleted: ");
        del=sc.nextLine().trim();
        System.out.println("Position?: ");
        pos=sc.nextInt();
    }
    void compute()
    {
        String arr[] =str.split(" ");
        arr[pos-1]="";
        str="";
        for(int i=0;i<arr.length;i++)
        {
            if(i==(pos-1))
                str=str.concat(arr[i]);
            else
                str=str.concat(arr[i]).concat(" ");
        }        
    }
    void display()
    {
        System.out.println(str);
    }    
    public static void main(String args[])
    {
        Apex1 obj =new Apex1();
        obj.accept();
        obj.compute();
        obj.display();
    }
}