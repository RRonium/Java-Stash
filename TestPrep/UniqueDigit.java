import java.util.Scanner;
class UniqueDigit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("m = ");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("n = ");
        int n = Integer.parseInt(in.nextLine());
        if(m > n || m >= 30000 || n >= 30000){
            System.out.println("INVALID RANGE");
            return;
        }
        int count = 0;
        System.out.print("THE UNIQUE-DIGIT INTEGERS ARE: ");
        for(int i = m; i <= n; i++){
            if(isUnique(i)){
                if(count == 0)
                    System.out.print("\n" + i);
                else
                    System.out.print(", " + i);
                count++;
            }
        }
        if(count == 0)
            System.out.print("NIL");
        System.out.println("\nFREQUENCY OF UNIQUE-DIGIT INTEGERS IS: " + count);
    }
    public static boolean isUnique(int n){
        String s = String.valueOf(n);
        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            String sub = s.substring(i + 1);
            if(sub.indexOf(ch) >= 0)
                return false;
        }
        return true;
    }
}