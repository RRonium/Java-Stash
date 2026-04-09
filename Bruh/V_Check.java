public class V_Check
{ 
  public static void checkVowels(String str) throws VException
  {
    boolean HasVowels=false;
    char arr[]={'a','e','i','o','u'};
    for (int i=0; i <str.length(); i++) 
    {
      char ch=str.charAt(i);
      for(int c=0;c<arr.length;c++)
      {
      if(ch==arr[c]) 
      {
        HasVowels = true;
        break;
      }
      }
    }
    if (HasVowels) {
      throw new VException("No vowels");
    }
  }
  public static void main(String[] args) 
  {
    try
    {
      String str = "Hello my name is Sannidhya ";
      System.out.println(str);
      checkVowels(str);
      System.out.println("Contains vowels");
    } catch (VException e) {
      System.out.println("Invalid");
    }
  }
}
class VException extends Exception {
  public VException(String message) {
    
  }
}