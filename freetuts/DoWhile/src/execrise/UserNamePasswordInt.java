package execrise;

import java.util.Scanner;

/*
 * Chương trình yêu cầu bạn nhập username và password từ bàn phím. 
 * Nếu người dùng nhập đúng thì hiển thị thông báo "Welcome" + username, nếu người dùng nhập sai thì yêu cầu nhập lại.
 */
public class UserNamePasswordInt {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		int user = 123;
		int pass = 123;
		int  username;
		int  password;
		// Input
		do {
			System.out.print("Enter the username: ");
			username = scanner.nextInt();
			
			System.out.print("Enter the password: ");
			password = scanner.nextInt();

		} while (pass != password || user != username);
		
		 System.out.println("Welcome " + user);
		// Close object scanner
		scanner.close();
	}

}
