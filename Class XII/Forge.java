public class Forge
{
  public static void main(String[] args)
  {
    String str = "Split a string by spaces, and also punctuation.";
    String regex = "s";
    String arr[] = str.split(regex);
    
    for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    
    
  }
}