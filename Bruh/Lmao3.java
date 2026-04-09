import java.util.*;
class Lmao3
{
    public static void main(String args[])
    {
        int arr[][] =new int[4][4];
        int max1=arr[0][0];
        int max2=arr[0][3];
        for(int i=0;i<4;i++)
        {
              if(arr[i][i] > max1)
              {
                  max1=arr[i][i];
              }
              if(arr[i][3-(i+1)] > max2)
              {
                  max2=arr[i][3-(i+1)];
              }
              System.out.println(max1,max2);
        }
    }
}