import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1, val = 1;

        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) a[top][j] = val++;
            top++;
            for (int i = top; i <= bottom; i++) a[i][right] = val++;
            right--;
            if (top <= bottom)
                for (int j = right; j >= left; j--) a[bottom][j] = val++;
            bottom--;
            if (left <= right)
                for (int i = bottom; i >= top; i--) a[i][left] = val++;
            left++;
        }

        int diag = 0;
        for (int i = 0; i < n; i++) {
            diag += a[i][i];
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
                if (j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
        System.out.print("Diagonal: " + diag);
    }
}
