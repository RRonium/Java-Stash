public class Employee//Super Class
{
int empNo;
String empName, empDesig; Employee() //Parameterised Constructor
{
empNo = 0; empName = ""; empDesig = "";
}
Employee(int N, String Na, String De) //Parameterised Constructor
{
empNo = N; empName = Na; empDesig = De;
}
void display()//Display method
{
System.out.println("Employee number: "+empNo); System.out.println("Employee name: "+empName); System.out.println("Employee Designation: "+empDesig);
}
}
class Salary extends Employee //Sub class
{
double basic;
Salary(double b, int empNo, String empName, String empDesig) //Parameterised Constructor
{
super(empNo,empName, empDesig); basic = b;
}
void calculate() //Method to calculate
{
double DA = basic * (10/100); double HRA = basic * (15/100); double Salary = basic + DA + HRA; double PF = Salary * (8/100); double Net_Salary = Salary - PF; super.display();
System.out.println("Basic Salary: "+basic); System.out.println("Net Salary: "+Net_Salary);
}
}
