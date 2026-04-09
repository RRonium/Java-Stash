class Emirp {
    // Data members/instance variables
    int n;    // stores the number
    int rev;  // stores the reverse of the number
    int f;    // stores the divisor

    // Constructor to initialize data members
    Emirp(int nn) {
        n = nn;
        rev = 0;
        f = 2;
    }

    // Method to check if a number is prime using recursive technique
    int isprime(int x) {
        if (x <= 2) {
            if (x == 2) return 1;
            return 0;
        }
        if (x % f == 0) return 0;
        if (f * f > x) return 1;
        f++;
        return isprime(x);
    }

    // Method to reverse a number
    int reverse(int x) {
        int temp = x;
        int reversed = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed;
    }

    // Method to check if the number is an Emirp
    void isEmirp() {
        int reversed = reverse(n);
        int isOriginalPrime = isprime(n);
        int isReversedPrime = isprime(reversed);

        if (isOriginalPrime == 1 && isReversedPrime == 1) {
            System.out.println(n + " is an Emirp number.");
        } else {
            System.out.println(n + " is not an Emirp number.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Emirp class
        int num = 13; // Example number
        Emirp emirpObj = new Emirp(num);

        // Check if the number is an Emirp
        //emirpObj.isprime();
        emirpObj.isEmirp();
    }
}
