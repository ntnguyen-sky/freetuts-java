package exercise;

import java.util.Scanner;

/*
 * Hướng dẫn: Trong toán học, chúng ta có định lý Bất đẳng thức tam giác được mô tả như sau: 
 * "Trong một tam giác, tổng độ dài hai cạnh bất kỳ bao giờ cũng lớn hơn cạnh còn lại". 
 * Vậy để kiểm tra số đo 3 đoạn thẳng vừa nhập có tạo thành một tam giác thường không 
 * thì chúng ta sẽ tính độ dài của hai cạnh bất kỳ và so sánh với cạnh còn lại, 
 * nếu kết quả là lớn hơn thì 3 đoạn thẳng vừa nhập sẽ tạo thành một tam giác. 
 * 
 * Để tính chu vi của một tam giác khi biết số đo 3 cạnh ta tính theo công thức Hê-rông như sau:
 * Chu vi =  A + B + C (trong đó A, B, C là số đo 3 cạnh của tam giác).
 * 
 * Dưới đây là bài giải của bài tập này.
 */

public class PerimeterTriangle {
	
	// Method to check if the sides form a valid triangle
	public static boolean isValidTriangle(double side1, double side2, double side3) {
		return (((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1));
	}
	
	public static void main(String[] args) {
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter the lengths of the sides of the triangle
		System.out.print("Enter the length of the first side: ");
		double side1 = scanner.nextDouble();
		System.out.print("Enter the length of the first side: ");
		double side2 = scanner.nextDouble();
		System.out.print("Enter the lenght of the first side: ");
		double side3 = scanner.nextDouble();
		
		if (side1 >0 && side2 > 0 && side3 > 0) {
			// Check if enter sides form a valid triangle
			if(isValidTriangle(side1, side2, side3)) {
				// Calculate the perimeter of the triangle
				double perimeter = side1 + side2 + side3;
				// Display the perimeter
				System.out.println("The perimeter of the triangle is: " + perimeter);
			} else {
				// Display a message indicating the sides do not form a triangle
				System.out.println("The entered sides do not form a valid triangle.");
			}
		} else {
			System.out.println("Sides of the triangle must greater than 0.");
		}
		
		
		// Close Scanner object to avoid memory leaks
		scanner.close();
		
	}

}
