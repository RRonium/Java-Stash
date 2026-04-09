import java.util.*;
public class Lul
{   
    int N,day,year;
    //String month="";
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter present date: ");
        day=sc.nextInt();
        System.out.println("Enter present year: ");
        year=sc.nextInt();
        System.out.println("Enter future date: ");      
        N=sc.nextInt();
        if(N<1 || N>100)
            System.exit(0);              
    }
    boolean leap_check()
    {
        if((year%100)%4==0)
        {
            if(day<0 || day>366)
                System.exit(0);
            return true;
        }
        else
        {
            if(day<0 || day>365)
                System.exit(0);
            return false;
        }  
    }
    void predict()
    {
        int day_num[]={31,28,31,30,31,30,31,31,30,31,30,31},i=0,D=day;
        String month[] = {"JANUARY", "FEBRUARY", "MARCH","APRIL", "MAY", "JUNE","JULY", "AUGUST", "SEPTEMBER","OCTOBER", "NOVEMBER", "DECEMBER"}, months="";
        day_num[2]=(leap_check()==true)?29:28;
        D+=N;
        if(leap_check()==true)
        {
            if(D>=366)
                {year++;
                    D-=366;}
        }
        else
        {
            if(D>=365)
                {year++;
                    D-=365;}
        }
        System.out.println(D);
        for(i=0;i<12;i++)
        {
           if(D>day_num[i])
           {
               D-=day_num[i];  
               months=month[i];
           }
           
           //System.out.println(i++);
        }      
        if(D%10==1)
            System.out.println("DATE: "+D+"ST "+months+" ,"+year);
        else if(N%10==2)
            System.out.println("DATE: "+D+"ND "+months+" ,"+year);
        else if(N%10==3)
            System.out.println("DATE: "+D+"RD "+months+" ,"+year);
        else 
            System.out.println("DATE: "+D+"TH "+months+" ,"+year);
    }
    public static void main(String args[])
    {        
        Lul obj=new Lul();
        obj.accept();
        obj.predict();
    }
}
