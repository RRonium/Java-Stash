import java.util.*;
class Fascinating
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n=sc.nextInt(),p2=n*2,p3=n*3,flag=0;
        String str=Integer.toString(n), str2=Integer.toString(p2),str3=Integer.toString(p3);        
        String s=str+str2+str3;
        System.out.println(s);
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            switch(arr[i])
            {
                case 1:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='1')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 2:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='2')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 3:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='3')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 4:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='4')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 5:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='5')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 6:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='6')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 7:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='7')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 8:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='8')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 9:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='9')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
                case 0:
                    
                    for(int c=1;c<arr.length;c++)
                    {
                        if(arr[i]=='0')
                        {
                            System.out.println("Not a fascinating number");
                            System.exit(0);
                        }
                    }
                    break;
            }
        }
        System.out.println("Fascinating number");
        /*for(int i=0;i<arr.length;i++)
        {
            if(s.charAt(i)==arr[i])
            {
                System.out.println("Not a fascinating number");
                System.exit(0);
            }
            else
                arr[i]=s.charAt(i);
        }
        System.out.println("Fascinating Number");*/
    }
}