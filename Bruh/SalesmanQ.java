public class SalesmanQ
{
    public static void main(String args[])
    {
        int reg1[]={5200,2600,9840,6958};
        int reg2[]={3521,3896,7845,5491};
        int reg3[]={3500,6700,7500,6850};
        int reg4[]={9000,8540,8345,7591};
        int reg5[]={2600,3450,5480,6940};
        int tsales=0;
        for(int i=0;i<reg1.length;i++)
        {
            tsales=(reg1[i]+reg2[i]+reg3[i]+reg4[i]+reg5[i]);
            System.out.println("Total sales by Salesman "+(i+1)+" is "+tsales);
        }
    }
}
