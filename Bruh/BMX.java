public class BMX
{
    public static void main(String args[])
    {
        /*int a[]={5,6,2,1,7,8,3};
        int i=2,c=8;
        i+=++a[3]+a[4+1]++%(5-a[2]);
        i+=2+c++%3;
        System.out.println(i);*/
        int A=50,x=20;
        A/=x++ %9 - ++x/(7+3) +x--;
        System.out.println(A);
    }
}