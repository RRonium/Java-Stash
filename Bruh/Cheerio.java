import java.util.*;
public class Cheerio
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a class path: ");        
        String path = sc.nextLine();
        
        System.out.println("File name: " + path.substring(path.lastIndexOf('/')+1,path.lastIndexOf('.')));
        System.out.println("Extension: " + path.substring(path.lastIndexOf('.')+1));
    }
}