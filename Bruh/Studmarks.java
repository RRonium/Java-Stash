import java.util.*;
class Studmarks
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of students please: ");
        int n = sc.nextInt();
        int i;
        double avg=0;
        int roll[] =new int[n];             
        int subA[] =new int[n];
        int subB[] =new int[n];
        int subC[] =new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the roll no.: ");
            roll[i]=sc.nextInt();
            System.out.println("Enter the marks for subject A: ");
            subA[i]=sc.nextInt();
            System.out.println("Enter the marks for subject B: ");
            subB[i]=sc.nextInt();
            System.out.println("Enter the marks for subject C: ");
            subC[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.println("Roll no. \t Subject A \t Subject B \t Subject C");
            System.out.println(roll[i] + "\t\t" + subA[i] + "\t\t" + subB[i] + "\t\t" + subC[i]);
        }
        for(i=0;i<n;i++)
        {
            avg = (subA[i]+subB[i]+subC[i])/3;
            System.out.println("Average marks: "+avg);
            if(avg>80)
            {
               System.out.println("Student with roll no. "+roll[i]+" got average marks above 80");
            }
            else
            {
                System.out.println("Student with roll no. "+roll[i]+ " got average marks below 40");
            }
        }
    }
}