package exercise;

import java.util.Scanner;

/**
 * Nhập vào thông tin của một sinh viên từ bàn phím
 * (thông tin đó bao gồm họ tên, năm sinh và địa chỉ)
 * Sau đó hiển thị các thông tin vừa nhập ra màn hình Console.
 */
/**
 * a Java program that takes input information about a student
 * (name, age, address)
 * and then prints it to the screen
 */
public class StudentInformation {

	public static void main(String[] args) {
//		Create Scanner Object to read input
		Scanner scanner = new Scanner(System.in);
//		Prompt for Input
//		Input student information
		System.out.print("Enter your fullname: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter student grage: ");
        double grage = scanner.nextDouble();
		
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		
/**
 * It looks like there are a couple of issues in your code. 
 * Specifically, there's a problem with how the input is handled. 
 * When you use nextInt() to read the age, 
 * it doesn't consume the newline character left in the buffer, 
 * which causes the subsequent nextLine() call to read an empty string		
 * => This will happen with all numeric data types
 */
		
//		Consume the leftover newline character
		scanner.nextLine();
		
		System.out.print("Enter your address: ");
		String address = scanner.nextLine();
		
//		Output student information
		System.out.println("\nStudent Information: ");
		System.out.println("Name: " + name);
		System.out.println("Grage: " + grage);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		
//		Close the Scanner object after using to avoid memory leaks
		scanner.close();
	}

}
