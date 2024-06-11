package exercise;

import java.util.Scanner;

/*
 *  Cách xác định năm nhuận:
 *  Một năm được coi là năm nhuận nếu năm đó chia hết cho 4 và không chia hết cho 100.
 *  Mặt khác, những năm chia hết cho 100 sẽ được goi là năm nhuận nếu năm đó cũng chia hết cho 400.
 */
public class LeapYear {

	public static void main(String[] args) {
		// Create Scanner to input
		Scanner scanner = new Scanner(System.in);
		
		// Declare variable
		int year;
		
		System.out.print("Enter year: ");
		year = scanner.nextInt();
		
		// Close Scanner object 
		scanner.close();
		
		if ( (year%4 == 0)) {
			if (year%100 != 0) 
				System.out.println("Year " + year + " is a lead year.");
			else if (year%100 == 0 && year%400 == 0){
				System.out.println("Year " + year + " is a lead year.");
			}
		} else System.out.println("Year " + year + " is not lead year");
		

	}

}
