package practise;

import java.util.Scanner;

public class FactorialUsingIteration {
	public static int calculateFactorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int inputNumber = scanner.nextInt();

        int factorial = calculateFactorial(inputNumber);

        System.out.println("Factorial of " + inputNumber + " is: " + factorial);

        scanner.close();
    
	}

}
