import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] st = new int[n];
        int top = -1;

        while (n-- > 0) {
            String op = sc.next();
            if (op.equals("PUSH")) {
                st[++top] = sc.nextInt();
            } else if (op.equals("POP")) {
                System.out.println(top == -1 ? "EMPTY" : st[top--]);
            } else if (op.equals("PEEK")) {
                System.out.println(top == -1 ? "EMPTY" : st[top]);
            } else if (op.equals("SIZE")) {
                System.out.println(top + 1);
            }
        }
    }
}
