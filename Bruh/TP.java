public class TP
{
    public static void main(char c_name, long mobile, double cost)
    {
       if(cost <= 10000 )
       {
         double discount= cost - 5/100 * cost;  
         System.out.println("final price =" + discount);
       }
       else if(cost>10000||cost<=20000)
       {
        double discount= cost - 10/100 * cost;  
         System.out.println("final price =" + discount);
       }
       else if(cost>20000||cost<=35000)
       {
         double discount= cost - 15/100 * cost;  
         System.out.println("final price =" + discount);
       }
       else if(cost>35000)
       {
           double discount= cost - 20/100 * cost;  
           System.out.println("final price =" + discount); 
       }
       System.out.println("Customer name:"+ c_name);
       System.out.println("Customer phone:"+ mobile);
       }
}