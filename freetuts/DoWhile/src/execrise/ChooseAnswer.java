package execrise;

import java.util.Scanner;

public class ChooseAnswer {

	public static void main(String[] args) {
		// Scanner 
		Scanner scanner = new Scanner(System.in);
		
		String c = "y"; // repeat
		String  answer;
		do {
			System.out.println("Cách nào cho phép người dùng khai báo 1 giá trị số nguyên trong 4 đáp án sau?");
			System.out.println("a. int number = 123;");
			System.out.println("b. int number = \"123\";");
			System.out.println("c. int number = '1';");
			System.out.println("d. boolean number = 1;");
			System.out.print("Answer: ");
			answer = scanner.nextLine(); // use char : answer = scanner.next().charAt(0);
			if (answer.equals("n")) {
				c = "stop"; break;
			}
			if (answer.equals("a")) {
				System.out.println("Correct answer!");
				c = "n"; break;
			}
			if (answer.equals("b") || answer.equals("c") || answer.equals("d")) {
				System.out.println("The number is incorrect!");
				answer = "y";
			} else {
				System.out.println("The answer must be a,b,c or d!");
				answer = "y";
			}
		} while (c.equals(answer));
		
		// Close scanner
		scanner.close();
	}

}
