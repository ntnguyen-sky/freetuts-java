package exercise;

import java.util.Scanner;

/**
 * Sử dụng Scanner nhập tên và địa chỉ của bạn từ bàn phím và sau đó hiển thị đó ra màn hình.
 */
public class YourInformation {

	public static void main(String[] args) {
		// Create a Scanner object to read data from the keyboard
		Scanner scanner = new Scanner(System.in);
		
		// Enter name using nextLine() method
		System.out.println("Enter your name: ");
		String yourname = scanner.nextLine();
		
		// Your name as using the nextLine() method
		System.out.println("Your name as using nextLine() method: " + yourname);
		
		System.out.println("\n");
		
		// Enter address using next() method
		System.out.println("Please enter the address: ");
		String youraddress = scanner.next();
		
		// Your address as using next() method
		System.out.println("Your address as using next() method: " + youraddress);
		
//		// Enter address using nextLine() method
//		System.out.println("Please enter the address one more time: ");
//		String youraddressnextLine = scanner.nextLine();
//		
//		// Your address as using nextLine() method
//		System.out.println("Your address as using nextLine() method: " + youraddressnextLine);
		
		//Close the Scanner object after using to8 avoid memory leaks
		scanner.close();
	}

}
