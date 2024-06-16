package exercise;

import java.util.Scanner;

/*
 * Bạn hãy nhập vào 1 tháng bất kỳ từ bàn phím, sau đó hiển thị ngày tương ứng của tháng đó. 
 * Nếu là tháng 2 thì yêu cầu nhập vào năm: Nếu năm đó là năm nhuận thì có 29 ngày, còn không thì có 28 ngày. 
 * Nếu người dùng nhập vào tháng không hợp lệ thì thông báo "Tháng không hợp lệ". 
 */
public class DayOfMonth {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Input data
		System.out.print("Enter the month: ");
		int month = scanner.nextInt();
		
		int days = 0;
		
		// Check month febuary

			switch (month) {
			case 1:
				days = 31; break;
			case 2: 
				System.out.print("Enter the year: ");
				int year = scanner.nextInt();
				
				if (year%4 == 0) {
					days = 29;
				}
				break;
			case 3:
				days = 30; break;
			case 4:
				days = 30; break;
			case 5:
				days = 31; break;
			case 6: 
				days = 30; break;
			case 7:
				days = 31; break;
			case 8:
				days = 31; break;
			case 9: 
				days = 30; break;
			case 10: 
				days = 31; break;
			case 11:
				days = 30; break;
			case 12:
				days = 31; break;
			}
		System.out.println("Days: " + days);
		
		// Close object scanner
		scanner.close();
	}

}
