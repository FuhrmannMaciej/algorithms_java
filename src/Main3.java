import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        // Równania 5 stopnia
        // ax^5 + bx^4 + cx^3 + dx^2 + ex + f

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter MIN: ");
        int min = scanner.nextInt();
        System.out.println("Enter MAX: ");
        int max = scanner.nextInt();
        System.out.println("Enter DELTA: ");
        double delta = scanner.nextDouble();

        List<Double> results = new ArrayList<>();

        for (double i = min; i <= max; i += delta) {
            double element = calculateEquation(i);
            double nextElement = calculateEquation((i + delta));

            if ((element * nextElement) < 0) {
                results.add(checkBetweenPoints(element, nextElement));
            } else if ((element * nextElement) == 0) {
                if (element == 0) {
                    results.add(element);
                } else {
                    results.add(nextElement);
                }
            }
        }

        System.out.println("Zeros of function are: ");
        for (double result : results) {
            System.out.println(result);
        }
    }

    private static double checkBetweenPoints(double element, double nextElement) {

            double average = (element + nextElement) / 2.0;
            double averageElement = calculateEquation(average);
            if ((element * averageElement) < 0) {
                return checkBetweenPoints(element, averageElement);
            } else if ((averageElement * nextElement) < 0) {
                return checkBetweenPoints(averageElement, nextElement);
            }
    }

    private static double calculateEquation(double x) {
        int a = 5;
        int b = 3;
        int c = 1;
        int d = -4;
        int e = -5;
        int f = -9;
        return (a * Math.pow(x, 5.0)) + (b * Math.pow(x, 4.0)) + (c * Math.pow(x, 3.0)) + (d * Math.pow(x, 2.0)) + (e * x) + f;
    }
}
