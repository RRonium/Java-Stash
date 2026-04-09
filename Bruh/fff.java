import java.util.Scanner;

class Perfect {
    private int num;

    public Perfect(int nn) {
        num = nn;
    }

    private int sum_of_factors(int i) {
        if (i == 1) {
            return 1;
        }
        if (num % i == 0) {
            return i + sum_of_factors(i - 1);
        }
        return sum_of_factors(i - 1);
    }

    public void check() {
        int factorSum = sum_of_factors(num - 1);
        if (factorSum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        Perfect obj = new Perfect(num);
        obj.check();
    }
}
