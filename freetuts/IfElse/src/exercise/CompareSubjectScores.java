package exercise;

import java.util.Scanner;

public class CompareSubjectScores {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Input data
		System.out.print("Enter your score for the basic programming subject: ");
		int basicProgramming = scanner.nextInt();
		
		System.out.print("Enter your score for the web programming subject: ");
		int webProgramming = scanner.nextInt();
		
		// Compare
		if (basicProgramming > webProgramming) {
			System.out.println("The basic programming subject's score is greater than the web programming subject's score. (" 
					+ basicProgramming + " > " + webProgramming + ")");
		} else if (basicProgramming < webProgramming) {
			System.out.println("The basic programming subject's score is less than the web programming subject's score. (" 
					+ basicProgramming + " < " + webProgramming + ")");
		} else System.out.println("Both them is equal. (" + basicProgramming + " = " + webProgramming + ")" );
		
		// Close Scanner object to avoid memory leaks
		scanner.close();
	}

}
