import java.util.*;
public class Amrstrong {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt(), rem, result = 0, userval=0;
        userval = num;
        while (num != 0) //Check if num is not equal to 0 in while loop condition
        {
            rem = num % 10;
            result += Math.pow(rem, 3); //Cube that numbers
            num /= 10;
        }

        if(result == userval)
            System.out.println(userval + " is an Armstrong number."); //Outputs
        else
            System.out.println(userval+ " is not an Armstrong number.");
    }
}