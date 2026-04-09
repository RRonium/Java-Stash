import java.io.IOException;
class Test
{
    public static void main(String args[]) throws IOException
    {
        PipedOuputStream out =new PipedOutputStream();
        PipedInputStream out =new PipedInputStream();        
        try
        {
            in.connect(out);
            out.write(65);
            byte[] b =new byte[2];
            in.read(b,0,2);
            String s =new String(b);
            System.out.println(""+s);
            
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
