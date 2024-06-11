package exercise;

import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Promptly the user to enter input data
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
		// Close the scanner
		scanner.close();
		
		// Check age
		if (age < 16) {
			System.out.println("[" + name + "] is a teenager.");
		} else if (age >= 16) {
			System.out.println("[" + name + "] is in adulthood.");
		} else {
			System.out.println("[" + name + "] is old");
		}
		

	}

}
