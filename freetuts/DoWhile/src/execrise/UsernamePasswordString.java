package execrise;

import java.util.Scanner;

public class UsernamePasswordString {

	public static void main(String[] args) {
		// Scanner
		Scanner scanner = new Scanner(System.in);

		String user = "123";
		String pass = "123";
		String username;
		String password;

		do {
			System.out.print("Enter the username: ");
			username = scanner.nextLine();

			System.out.print("Enter the password: ");
			password = scanner.nextLine();

		} while (!pass.equals(password) || !user.equals(username));

		System.out.println("Welcome " + user);

		// Close object scanner
		scanner.close();
	}

}
