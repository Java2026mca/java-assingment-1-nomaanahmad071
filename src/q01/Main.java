import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int spaces = n - 1 - i;
            int width = 2 * i + 1;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < spaces; j++) sb.append(' ');
            if (width == 1) {
                sb.append('*');
            } else {
                sb.append('*');
                for (int j = 0; j < width - 2; j++) sb.append(' ');
                sb.append('*');
            }
            System.out.println(sb.toString());
        }
        
        for (int i = n - 2; i >= 0; i--) {
            int spaces = n - 1 - i;
            int width = 2 * i + 1;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < spaces; j++) sb.append(' ');
            if (width == 1) {
                sb.append('*');
            } else {
                sb.append('*');
                for (int j = 0; j < width - 2; j++) sb.append(' ');
                sb.append('*');
            }
            System.out.println(sb.toString());
        }
    }
}
