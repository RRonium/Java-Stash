import java.util.*;
public class MarksAvg
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String name[] =new String[20];
        System.out.println("Enter no. of students: ");
        int n = sc.nextInt(), i,avg;
        int roll[] =new int[n],sub1[] =new int[n],sub2[] =new int[n],sub3[] =new int[n];    //3 arrays for the marks of 3 subjects
        for(i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" Student's info: ");     //accepting the necessary values
            System.out.println("Roll no.: ");
            roll[i] = sc.nextInt();
            System.out.println("Physics marks: ");
            sub1[i] = sc.nextInt();
            System.out.println("Chemistry marks: ");
            sub2[i] = sc.nextInt();
            System.out.println("Math marks: ");
            sub3[i] = sc.nextInt();
            avg = (sub1[i]+sub2[i]+sub3[i])/3;
            
            if(sub1[i]>=85 && sub1[i]<=100)         //Caluculate of marks range
            {
                System.out.println("Student "+ (i+1)+ "'s average marks: "+avg);
                System.out.println("Remarks: Excellent");                   //remarks according to merit
            }
            else if(sub1[i]>=75 && sub1[i]<=84)
            {
                System.out.println("Student "+ (i+1)+ "'s average marks: "+avg);
                System.out.println("Remarks: Distinction");
            }
            else if(sub1[i]>=60 && sub1[i]<=74)
            {
                System.out.println("Student "+ (i+1)+ "'s average marks: "+avg);
                System.out.println("Remarks: First class");
            }
            else if(sub1[i]>=40 && sub1[i]<=59)
            {
                System.out.println("Student "+ (i+1)+ "'s average marks: "+avg);
                System.out.println("Remarks: Pass");
            }
            else if(sub1[i]<40)
            {
                System.out.println("Student "+ (i+1)+ "'s average marks: "+avg);
                System.out.println("Remarks: Poor");
            }
            else
            {
                System.out.println("INVALID");          //default statement
            }
        }          
    }
}
