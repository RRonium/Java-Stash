import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class Cengage
{    
    public static void main(String[] args)
    { 
        try
        { 
            FileReader fr = new FileReader("I.txt");
            FileWriter fw = new FileWriter("O.txt");
            String str=""; 
            int i;             
            while ((i=fr.read()) != -1)
            {
                str += (char)i;
            }
            System.out.println(str); 
            fw.write(str);
            fr.close();
            fw.close();            
            System.out.println("Finished");
        } 
        catch (IOException e) 
        { 
            System.out.println("Exception");
        }
    }
}