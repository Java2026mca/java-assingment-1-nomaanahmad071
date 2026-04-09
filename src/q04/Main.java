import java.util.*;

public class Main {
    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++)
            if (x % i == 0) return false;
        return true;
    }

    static boolean isPerfect(int x) {
        if (x < 2) return false;
        int sum = 1;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                sum += i;
                if (i != x / i) sum += x / i;
            }
        }
        return sum == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int x = sc.nextInt();
            boolean p = isPrime(x), pf = isPerfect(x);
            if (p && pf) System.out.println("Both");
            else if (p) System.out.println("Prime");
            else if (pf) System.out.println("Perfect");
            else System.out.println("Neither");
        }
    }
}
