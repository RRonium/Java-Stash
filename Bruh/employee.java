import java.util.*;
public class employee
{
    int eno,age;
    double basic, net;
    String ename="";
    Scanner sc =new Scanner(System.in);
    employee()
    {
        eno=0;
        age=0;
        basic=0.0;
        ename="";
        net=0.0;
    }
    void accept()
    {
        System.out.println("Please enter employee number: ");
        eno=sc.nextInt();
        System.out.println("Please enter age: ");
        age=sc.nextInt();
        System.out.println("Please enter name: ");
        ename=sc.next();
        System.out.println("Please enter basic salary: ");
        basic=sc.nextDouble();
    }
    void calculate()
    {
        double hra,da,pf;
        hra= (18.5/100)*basic;
        da= (17.45/100)*basic;
        pf= (8.10/100)*basic;
        net=basic+hra+da-pf;
        net+=age>50?5000:0;               
    }
    void print()
    {
        System.out.println("eno \t ename \t age \t basic \t net");
        System.out.println(eno+"\t"+ename+"\t"+age+"\t"+basic+"\t"+net);
    }
    public static void main(String args[])
    {
        employee obj =new employee();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}