import java.util.*;
class dayyum implements SlapPranay
{    
    public void slapballs()
    {
        System.out.println("Pranay's balls have been Slapped");
    }
    public void slapcheeks()
    {
        System.out.println("Pranay's cheeks have been Slapped");
    }
    public boolean dohelikeit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("U think he likes it? (Y/N)");
        char ch=sc.next().charAt(0);
        if(ch=='y' || ch =='Y')
        {
            return true;
        }
        else if(ch=='n' || ch =='N')
        {
            return false;
        }
        else
        {
            System.out.println("Invalid");
            return false;
        }
    }    
    void leaveRoom()
    {
        System.exit(0);
    }
    void disp()
    {
        if(dohelikeit()==true)
        {
            System.out.println("Pranay wants more");
        }
        else if(dohelikeit()==false)
        {
            System.out.println("Pranay wants u to stop abusing him (>_<)");
            leaveRoom();
        }      
    }
    public static void main(String args[])
    {
        dayyum obj=new dayyum();
        obj.slapballs();
        obj.slapcheeks();       
        obj.disp();
    }
}