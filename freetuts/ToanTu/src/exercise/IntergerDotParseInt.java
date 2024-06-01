package exercise;

import java.util.Scanner;

public class IntergerDotParseInt {

	public static void main(String[] args) {
		String name;
		int year;
		String address;
		
//		Create Scanner object to read input
		Scanner scanner = new Scanner(System.in);
		
//		Input your information
		System.out.print("Enter name: ");
		name = scanner.nextLine();
		System.out.print("Enter year: ");
		/*
         *  sử dụng Integer.parseInt() để khắc phục hiện tượng trôi lệnh
         *  Integer.parseInt() sẽ chuyển dữ liệu kiểu chuỗi (String) thành số nguyên (Integer).
         */
		
//		Integer.parseInt(scanner.nextLine()) is generally more reliable.
		year = Integer.parseInt(scanner.nextLine());
//		scanner.nextLine();
		System.out.print("Enter address: ");
		address = scanner.nextLine();
		scanner.close();
//		Output your information
		System.out.println("Name: " + name);
		System.out.println("Year: " + year);
		System.out.println("Address: " + address);
		
	}

}
