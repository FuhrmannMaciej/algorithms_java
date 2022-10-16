import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // Równania 3 stopnia
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        System.out.println("Enter d: ");
        double d = scanner.nextDouble();

        double w = -( b / (3.0 * a) );
        double p = ( (3.0 * a * (Math.pow(w,2.0)) ) + (2.0 * b * w) + c)/a;
        double q = ( (a * (Math.pow(w,3.0)) ) + (b * (Math.pow(w,2.0)) ) + (c * w) + d)/a;

        double delta = ( (Math.pow(q,2.0) ) /4.0) + ( (Math.pow(p,3.0)) / 27.0);

        double x1;
        double x2;
        double x3;

        if (delta > 0){
            double u = ( Math.round(Math.pow( (-(q/2.0) + (Math.sqrt(delta)) ), 1.0 / 3.0)) );
            double v = ( Math.round(Math.pow( (-(q/2.0) - (Math.sqrt(delta)) ), 1.0 / 3.0)) );
            x1 = u + v + w;
            double Re_x2 = 0.5 * (u + v) + w;

            double Im_x2 = (Math.sqrt(3.0)/2.0) * (u - v);
            double Im_x3 = - (Math.sqrt(3.0)/2.0) * (u - v);

            System.out.println("X1: " + x1);
            System.out.println("Re(X2): " + Re_x2);
            System.out.println("Im(X2): " + Im_x2);
            System.out.println("Re(X3): " + Re_x2);
            System.out.println("Im(X3): " + Im_x3);
        } else if (delta == 0) {
            double var1 = Math.round(Math.pow((q / 2.0), 1.0 / 3.0));
            x1 = w - (2.0 * var1);
            x2 = w + ( var1 );
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        } else if (delta < 0) {
            double fi = Math.acos((3.0 * q) / (2.0 * p * (Math.sqrt(-(p/3.0) ) ) ));
            x1 = w + 2.0 * (Math.sqrt(-(p/3.0))) * (Math.cos((fi / 3.0)));
            x2 = w + 2.0 * (Math.sqrt(-(p/3.0))) * (Math.cos((fi / 3.0) + ((2.0 / 3.0 ) * (Math.PI) )));
            x3 = w + 2.0 * (Math.sqrt(-(p/3.0))) * (Math.cos((fi / 3.0) + ((4.0 / 3.0 ) * (Math.PI) )));

            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
            System.out.println("X3: " + x3);
        }
    }
}
