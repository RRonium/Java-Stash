import java.util.Scanner;
class Prime {
    int[][] arr;
    int r;
    int c;

    // Constructor to accept the size of the array
    Prime() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (m): ");
        r = scanner.nextInt();

        System.out.print("Enter the number of columns (n): ");
        c = scanner.nextInt();

        arr = new int[r][c];
    }

    // Method to check if a number is prime
    int isprime(int p) {
        if (p < 2) {
            return 0;
        }

        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return 0;
            }
        }

        return 1;
    }

    // Method to fill the elements of the array with the first m x n prime numbers
    void fill() {
        int count = 0;
        int num = 2;

        while (count < r * c) {
            if (isprime(num) == 1) {
                arr[count / c][count % c] = num;
                count++;
            }
            num++;
        }
    }

    // Method to display the array in a matrix form
    void display() {
        System.out.println("Array:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Prime prime = new Prime();
        prime.fill();
        prime.display();
    }
}
