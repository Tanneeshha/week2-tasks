import java.util.Scanner;
public class MathematicalProblemSolver {

    public static long factorial(int n){

        if (n < 0){
            throw new IllegalArgumentException("Factorial isn't defined for negative numbers.");
        }
        if (n > 20) {
            throw new ArithmeticException("Factorial result is too large for long data type.");
        }
        
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }

    public static boolean isPrime(int n){

        if ( n <= 1){
            return false;
        }
        for (int i = 2; i * i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate factorial: ");
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " = " + factorial(num));
        System.out.print("Enter a number to check if it's prime: ");
        num = scanner.nextInt();
        System.out.println(num + " is Prime Number? " + isPrime(num));

        scanner.close();
    }
}
