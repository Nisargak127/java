package practise;

import java.util.Scanner;

public class FactorialCalculator {
	public static int calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
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
	
