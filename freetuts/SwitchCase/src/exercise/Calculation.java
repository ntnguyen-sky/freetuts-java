package exercise;

import java.util.Scanner;

/*
 * Cho a và b là 2 số nguyên, kt là 1 ký tự nhập từ bàn phím (+, -, *, /). 
 * Nếu người dùng nhập kt là phép toán nào thì sẽ tự động thực hiện phép toán đó với 2 số a, b 
 * và hiển thị kết quả ra màn hình.
 */
public class Calculation {

	public static void main(String[] args) {
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);

		// Enter two number
		System.out.print("Enter the  first number: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter the second number:");
		int number2 = scanner.nextInt();

		scanner.nextLine();
		
		System.out.print("Enter the calculation: ");
		String calculation = scanner.nextLine();

		// Close Scanner object to avoid memory leak
		scanner.close();

		double result = 0;
		switch (calculation) {
		case "+":
			result = (double) number1 + number2;
			break;
		case "-":
			result = (double) number1 - number2;
			break;
		case "*":
			result = (double) number1 * number2;
			break;
		case "x":
			result = (double) number1 * number2;
			break;
		case "/":
			result = (double) number1 / number2;
			break;
		case ":":
			result = (double) number1 / number2;
			break;
		default:
			System.out.println("????");
		}
		System.out.println(number1 + "" + calculation + "" + number2 + " = " + result);

	}

}
