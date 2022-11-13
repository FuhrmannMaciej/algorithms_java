import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        // Algorytm Monte Carlo
        // g(x) = |ax^5 + bx^4 + cx^3 + dx^2 + ex + f|

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        System.out.println("Enter d: ");
        double d = scanner.nextDouble();
        System.out.println("Enter e: ");
        double e = scanner.nextDouble();
        System.out.println("Enter f: ");
        double f = scanner.nextDouble();

        System.out.println("Enter MIN x: ");
        int minX = scanner.nextInt();
        System.out.println("Enter MAX x: ");
        int maxX = scanner.nextInt();

        System.out.println("Enter DELTA: ");
        double delta = scanner.nextDouble();

        System.out.println("Enter EPSILON: ");
        double epsilon = scanner.nextDouble();

        double result;
        double maxY = 0;

        for (double i = minX; i <= maxX; i += delta) {
            double currentFuncValue = calculateEquation(a,b,c,d,e,f,i);
            if (currentFuncValue > maxY) {
                maxY = currentFuncValue;
            }
        }

        // generate random p (x,y)

        // calculateEquation for that x, if result < y -> Powyzej ++ else -> Ponizej ++

        System.out.println("Zeros of function are: ");
        for (double result : results) {
            System.out.println(result);
        }
    }


    private static double calculateEquation(double a, double b, double c, double d, double e, double f, double x) {
        return Math.abs((a * Math.pow(x, 5.0)) + (b * Math.pow(x, 4.0)) + (c * Math.pow(x, 3.0)) + (d * Math.pow(x, 2.0)) + (e * x) + f);
    }
}
