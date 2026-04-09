public class ImDone
{
    int x =10;
    int y= 20;
    public void swapByRef(ImDone obj)
    {
        int temp;
        temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
        System.out.println(obj.x+" "+obj.y);
    }
    public static void main(String args[])
    {
        ImDone obj = new ImDone();
        obj.swapByRef(obj);        
    }
    
}
