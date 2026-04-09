import java.util.Scanner;
class Perfect
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a perfect number:");
        int num = sc.nextInt();
        Perfect check = new Perfect(num);
        check.check();
    }

    private int num;

    // Parameterized constructor to initialize the data member num
    public Perfect(int num) {
        this.num = num;
    }

    // Returns the sum of the factors of the number, excluding itself, using a recursive technique
    public int sum_of_factors(int i) {
        if (i == 0) {
            return 0;
        } else {
            if (num % i == 0) {
                return i + sum_of_factors(i - 1);
            } else {
                return sum_of_factors(i - 1);
            }
        }
    }

    // Checks whether the given number is a perfect number and displays the result with an appropriate message
    public void check() {
        int sum = sum_of_factors(num - 1);
        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}

