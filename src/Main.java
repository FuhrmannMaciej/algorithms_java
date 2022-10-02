import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number range: ");
        int range = scanner.nextInt();

        for (int i = 3; i <= range; i++) {
            boolean isPrime = true;
            for (int j = i-1; j >= 2 ; j--) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                primeNumbers.add(i);
        }
        System.out.println("Prime numbers: ");
        for (int primeNumber: primeNumbers) {
            System.out.print(primeNumber + " ");
        }
        System.out.println();
        System.out.println("Twin primes: ");
        for (int i = 0; i < primeNumbers.size()-1; i++) {
            if (primeNumbers.get(i) == primeNumbers.get(i+1) - 2){
                System.out.println("(" + primeNumbers.get(i) + ", " + primeNumbers.get(i+1) + ")");
            }
        }
        System.out.println();
        System.out.println("Quadruple primes: ");
        for (int i = 0; i < primeNumbers.size()-3; i++) {
            if (    primeNumbers.get(i) == primeNumbers.get(i+1) - 2 &&
                    primeNumbers.get(i) == primeNumbers.get(i+2) - 6 &&
                    primeNumbers.get(i) == primeNumbers.get(i+3) - 8){
                System.out.println("(" + primeNumbers.get(i) + ", " + primeNumbers.get(i+1) +
                         ", " + primeNumbers.get(i+2) + ", " + primeNumbers.get(i+3) +")");
            }
        }
    }
}
