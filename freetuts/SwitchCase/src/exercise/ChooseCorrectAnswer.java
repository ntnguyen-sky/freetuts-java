package exercise;

import java.util.Scanner;

/*
 * Viết chương trình cho phép người dùng chọn 1 trong 4 đáp án a, b, c, d cho câu hỏi dưới đây. 
 * Nếu người dùng chọn đúng thì thông báo "Kết quả đúng!", 
 * nếu người dùng chon sai thì thông báo "Bạn chọn không đúng!", 
 * còn nếu người dùng nhập câu trả lời ngoài 4 đáp án a, b, c, d 
 * thì thông báo "Câu trả lời phải nằm trong 4 lựa chọn a, b, c hoặc d".
 * 
 * Sau đây là câu hỏi:
 * 
 * Cách nào cho phép người dùng khai báo 1 giá trị boolean trong 4 đáp án sau?
 * 
 * a. boolean bool1 = true;
 * 
 * b. boolean bool2 = "true";
 * 
 * c. boolean bool3 = "1";
 * 
 * d. boolean bool4 = 1;
 */
public class ChooseCorrectAnswer {

	public static void main(String[] args) {
		// Create object Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which way allows users to declare a boolean value in the following 4 answers?");
		System.out.println("a. boolean bool1 = true;");
		System.out.println("b. boolean bool2 = \"true\";");
		System.out.println("c. boolean bool3 = \"1\";");
		System.out.println("d. boolean bool4 = 1;");
		
		System.out.print("Enter your answer: ");
		char answer = scanner.next().charAt(0);
		
		switch (answer) {
		case 'a':
			System.out.println("The result is correct!");
			break;
		case 'b':
			System.out.println("You chose incorrectly!");
			break;
		case 'c':
			System.out.println("You chose incorrectly!");
			break;
		case 'd':
			System.out.println("The result is correct!");
			break;
		default:
			System.out.println("The answer must be in 4 options a,b,c or d.");
		}
		
		
		// Close the scanner to avoid memory leak
		scanner.close();
	}

}
