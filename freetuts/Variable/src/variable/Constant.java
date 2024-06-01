package variable;

public class Constant {

	public static final int HOUR_OF_DAY = 24;
	public static final String CHUOI = "Hello Freetuts!";

	public void getConstant() {

		System.out.println("Print from getContant() method.");
		System.out.println("Day is: " + HOUR_OF_DAY + " hours!");
	}
	
	public static void main(String[] args) {
		System.out.println("Day is: " + HOUR_OF_DAY + " hours!");
		System.out.println(CHUOI);
		
		Constant constant = new Constant();
		constant.getConstant();
	}

}
