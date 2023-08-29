package practise;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	public static boolean isArmstrong(int number) {
		int originalNumber = number;
		int sum = 0;
		int numDigits = (int) Math.log10(number) + 1;

		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, numDigits);
			number /= 10;
		}

		return sum == originalNumber;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int inputNumber = scanner.nextInt();

		if (isArmstrong(inputNumber)) {
			System.out.println(inputNumber + " is an Armstrong number.");
		} else {
			System.out.println(inputNumber + " is not an Armstrong number.");
		}

		scanner.close();
	}


}


