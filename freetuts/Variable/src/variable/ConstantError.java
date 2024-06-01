package variable;

public class ConstantError {
//	Declare constant
	public static final String CHUOI = "Hello Freetuts!";
	
	
	public static void main(String[] args) {
		System.out.println(CHUOI);
		
//		Change the value of the CHUOI variable
//		the compiler will report an error
//		CHUOI = "Welcome to Freetuts!"
		System.out.println(CHUOI);
		
	}

}
