import java.util.*;
class Q11
{
public static void main (String args[]){
int num1,num2,num3;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the numbers: ");
num1=scan.nextInt();//taking input from user for num1
num2=scan.nextInt();
num3=scan.nextInt();
//checking num1 is a middle number or not
    if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
        System.out.print(num1+"is a middle number");
    }
    //checking num2 is a middle number or not
    if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
        System.out.print(num2+"is a middle number");
    }
    //checking num3 is a middle number or not
    if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
        System.out.print(num3+"is a middle number");
    }
}
}