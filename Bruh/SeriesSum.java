import java.util.Scanner;

class SeriesSum {
    private int x;
    private int n;
    private double sum;

    public SeriesSum(int xx, int nn) {
        x = xx;
        n = nn;
        sum = 0.0;
    }

    private double find_fact(int m) {
        if (m == 0 || m == 1) {
            return 1.0;
        }
        return m * find_fact(m - 1);
    }

    private double find_power(int x, int y) {
        if (y == 0) {
            return 1.0;
        }
        return x * find_power(x, y - 1);
    }

    public void calculate() {
        for (int i = 1; i <= n; i++) {
            sum += find_power(x, 2 * i) / find_fact(2 * i - 1);
        }
    }

    public void display() {
        System.out.println("Sum of the series: " + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();
        
        SeriesSum obj = new SeriesSum(x, n);
        obj.calculate();
        obj.display();
    }
}
