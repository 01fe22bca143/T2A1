

import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();
        
        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();
        
        System.out.println("Prime numbers between " + lowerRange + " and " + upperRange + ":");
        generatePrimeNumbers(lowerRange, upperRange);
    }
    
    public static void generatePrimeNumbers(int lowerRange, int upperRange) {
        for (int number = lowerRange; number <= upperRange; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
