package variable;

import java.util.Scanner;

public class LocalVariableError {
	public void getInput() {
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		name = scanner.nextLine();
		
		// name variable need to input through Scanner object 
		// unless it will return a error
		// The local variable name may not have been initialize
		System.out.println("Your name is: " + name);
		// Close the Scanner object after using to avoid memory leaks
		scanner.close();
	}
	
	
	public static void main(String[] args) {
			LocalVariableError localVariableError = new LocalVariableError();
//			Hàm getInput() trong lớp LocalVariableError được thiết kế để lấy đầu vào từ người dùng và in ra tên của người dùng. 
			localVariableError.getInput();
		
	}

}
