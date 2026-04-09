import java.util.*;
class MockT2
{
    void accept()
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine().toUpperCase();
        if(str.endsWith(".")==false||str.endsWith("!")==false||str.endsWith("?")==false)
        {
            System.out.println("Invalid string");
            System.exit(0);
        }
    }
    
}