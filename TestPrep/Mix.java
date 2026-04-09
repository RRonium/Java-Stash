import java.util.*;
class Mix
{
   int arr[];
   int cap;
   static Scanner sc=new Scanner(System.in);
   Mix(int mm)
   {
   cap=mm;
   arr=new int[cap];
   }
   void accept()
 {
   System.out.println("Enter array");
   for (int i=0;i<cap;i++)
     arr[i]=sc.nextInt(); 
 }
  void display()
 { 
   for (int i=0;i<cap;i++)
     System.out.print(arr[i]+" ");
   System.out.println();
 }
 Mix Mix(Mix P,Mix Q)
 {
   Mix obj=new Mix(6);
   int k=0;
   for (int i=0;i<3;i++)
     obj.arr[k++]=P.arr[i];
   for (int i=0;i<3;i++)
     obj.arr[k++]=Q.arr[i];
   return obj;
 }
 public static void main()
 { 
   System.out.println("enter the capacity of both the array");
   int c1=sc.nextInt();  int c2=sc.nextInt();
   Mix obj1=new Mix(c1);
   Mix obj2=new Mix(c2);
   System.out.println("Enter the content of Ist array");
   obj1.accept();
   System.out.println("Enter the content of 2nd array");
   obj2.accept();
   Mix r=new Mix(c1+c2);
   Mix res=r.Mix(obj1,obj2);
   System.out.println("content of the combined array");
  res.display();
 }
}