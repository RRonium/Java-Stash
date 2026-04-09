import java.util.*;
public abstract class Apex2 implements Vehicle 
{
    Scanner sc =new Scanner(System.in);
    String str="";
    float maxspeed;
    public void getLicensePlate()
    {        
       System.out.println("Inter Lisence Plate: ");
       str=sc.nextLine();      
       setLicensePlate(str);
    }
    public String setLicensePlate(String licensePlate)
    {
        System.out.println("Here is license plate");
        return str;
    }
    public void getMaxSpeed()
    {
       System.out.println("Inter Lisence Plate: ");
       maxspeed=sc.nextFloat();      
       setMaxSpeed(maxspeed);        
    }
    public float setMaxSpeed(float maxSpeed)
    {
        System.out.println("Here is max speed");
        return maxSpeed;
    }
    public void start()
    {
        System.out.println("Car has started");
    }
    public void stop()
    {
        System.out.println("Car has stopped");
    }
}