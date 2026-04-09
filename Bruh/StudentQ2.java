import java.util.*;
public class StudentQ2
{
    int avg;
    public void avg(int sum, int n)     //calculation of the average
    {
       avg = (sum/n);
       System.out.println("Average marks of all the students: "+avg);        
    }
    public void dev(int n, int marks[], String name[])          //calculation of the deviation
    {
        for(int c = 0; c<n; c++)
        {
           System.out.println("Student name: "+name[c]);
           System.out.println("Student's marks deviation from the class average: "+(marks[c]-avg));
        }        
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        StudentQ2 obj =new StudentQ2();
        int sum=0;
        System.out.println("Enter No. of students: ");      //Accepting the number of entries
        int n = sc.nextInt();     
        String []name=new String[n];
        int []marks=new int[n];
        for(int i=0; i<n; i++)              //Accepting the names and marks of the students
        {
            System.out.println("Enter the student's name: ");
            name[i]=sc.next();
            System.out.println("Enter the student's marks: ");
            marks[i]=sc.nextInt();
            sum+= marks[i];
        }
        obj.avg(sum,n);     //calling the methods
        obj.dev(n,marks,name);
    }
}

    
 