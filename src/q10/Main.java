import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t = sc.nextLine().trim().split(" ");
        int[] st = new int[t.length];
        int top = -1;

        for (String s : t) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = st[top--], a = st[top--];
                if (s.equals("+")) st[++top] = a + b;
                else if (s.equals("-")) st[++top] = a - b;
                else if (s.equals("*")) st[++top] = a * b;
                else st[++top] = a / b;
            } else {
                st[++top] = Integer.parseInt(s);
            }
        }
        System.out.print(st[top]);
    }
}
