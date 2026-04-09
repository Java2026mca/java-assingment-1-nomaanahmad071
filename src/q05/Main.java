import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        double area = 0;

        if (s.equals("circle")) {
            double r = sc.nextDouble();
            area = Math.PI * r * r;
        } else if (s.equals("rectangle")) {
            double l = sc.nextDouble(), w = sc.nextDouble();
            area = l * w;
        } else if (s.equals("triangle")) {
            double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
            double p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        System.out.printf("Area: %.2f", area);
    }
}
