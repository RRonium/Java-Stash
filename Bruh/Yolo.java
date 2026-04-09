public class Yolo
{
    public static void main(String args[])
    {
        /*String str1 ="Python";
        String str2 ="Data Science";
        String str3 ="Python";
        String str4 ="C";
        String str5 =new String("Java");
        String str6 =new String("C++");
        String str7 =new String("Data Science");
        String str8 =new String("C").intern();
        
        System.out.println((str1==str5)+", Strings are not equal.");
        System.out.println((str2==str7)+", Strings are not equal.");
        System.out.println((str4=str8)+", Strings are equal.");*/
        
        String str1 = "Hello";
        /*String str2 = "Hello";
        String str3 = "hello";
        //System.out.println(str1.endsWith("llo"));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));*/
        char arr1[] =new char[str1.length()];
        str1.getChars(0,str1.length(),arr1,arr1[0]);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]+", ");
        }
        
        char arr[] = str1.toCharArray();
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]+", ");
        }
    }
}