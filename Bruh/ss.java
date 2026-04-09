import java.io.IOException;
import java.io.*;
class ss
 {
    public static void main(String[] args)
    {
        
        try {
            FileReader fr1 = new FileReader("f1.txt");
            FileReader fr2= new FileReader("f2.txt");
            FileWriter fw = new FileWriter("f3.txt");
            String str = ""; 
            int i; 
            while ((i = fr1.read()) != -1) 
            {
                str += (char)i;
            }
            while ((i = fr2.read()) != -1) 
            {
                str += (char)i;
            }
            System.out.println(str); 
            fw.write(str);
            fr1.close();
            fr2.close();
            fw.close();            
            System.out.println("done");
        }
 
        catch (IOException e) 
        { 
            System.out.println("invalid");
        }
    }
}