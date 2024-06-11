package exercise;

import java.util.Scanner;

/*
 * Viết chương trình nhập vào tọa độ điểm O (XO,YO) là tâm của một đường tròn, 
 * tọa độ điểm M (XM,YM) và bán kính R của đường tròn. 
 * Xác định và thông báo lên màn hình điểm M nằm trong, trên hay ngoài đường tròn đó.
 * 
 * Hướng dẫn: Để biết được điểm M nằm trong, trên hay ngoài 1 đường tròn 
 * thì chúng ta sẽ tính khoảng cách từ điểm M tới tâm O của đường tròn. 
 * Sau đó xét 3 trường hợp sau đây:
 * 
 * Nếu bình phương khoảng cách từ điểm M tới tâm O nhỏ hơn bình phương bán kính R thì điểm M nằm trong đường tròn.
 * Nếu bình phương khoảng cách từ điểm M tới tâm O bằng bình phương bán kính R thì điểm M nằm trên đường tròn.
 * Nếu bình phương khoảng cách từ điểm M tới tâm O lớn hơn bình phương bán kính R thì điểm M nằm ngoài đường tròn.
 */
public class CirclePointPosition {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Input the coordinates of the center O of the circle (xO,yO)
		System.out.print("Enter the X coordinate of the circle's center xO: ");
		double xO = scanner.nextDouble();
		
		System.out.print("Enter the y coordinate of the circle's center yO: ");
		double yO = scanner.nextDouble();
		
		// Input the coordinates of the point M
		System.out.print("Enter the X coordinate of the point xM: ");
		double xM = scanner.nextDouble();
		
		System.out.print("Enter the Y coordinate of the point yM: ");
		double yM = scanner.nextDouble();
		
		// Input the radius R of the circle
		System.out.print("Enter the radius of the circle: ");
		double r = scanner.nextDouble();
		
		// Calculate the distance from point M to the center O
		double distance = Math.sqrt(Math.pow(xM - xO, 2) + Math.pow(yM - yO, 2));
		
		// Determine the position of point M relative to the circle
		// and display the message
		
		// if the distance is less than r, point M is inside the circle
		if (distance < r) {
			System.out.println("Point M is inside the circle.");
		} else if (distance == r ) { // If the distance is equal to R, point M is on the circle
			System.out.println("Point M is on the circle.");
		} else { // If the distance is greater than r, point M is outside the circle
			System.out.println("Point M is outside the circle.");
		}
		
		// Close Scanner object to avoid memory leaks
		scanner.close();
	}

}
