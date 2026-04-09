    import java.util.*;
    class Doritos
    {
        public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter no. pls: ");
            double x = sc.nextInt(),S=0;
            for(int i=1;i<=20;i++)
            {
                if(i%2==0)
                    S-=Math.pow(x,i);
                else if(i%2!=0)
                    S+=Math.pow(x,i);
                else
                {
                    System.out.println("INVALID");
                    System.exit(0);
                }
            }
            System.out.println("S: "+S);
        }
    }