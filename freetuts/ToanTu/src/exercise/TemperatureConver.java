package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Viết chương trình nhập vào độ Celsius bất kỳ từ bàn phím. 
 * Sau đó đổi độ này sang độ Fahrenheit và hiển thị kết quả ra màn hình.
 * 
 * Hướng dẫn: Công thức chuyển đổi từ độ Celcius sang độ Fahrenheit như sau:
 * Độ Fahrenheit = (Độ Celsius * 9 /5 ) + 32.
 */
public class TemperatureConver {

	public static void main(String[] args) {
		// Enter Celsius
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Celsius Temparature: ");
		float celsius = scan.nextFloat();
		
		// close Scanner object to avoid memory leak
		scan.close();
		
		// Round decimal numbers
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		float fahrenheit = (float) (celsius * 9 / 5) + 32;
		System.out.println("Fahrenheit Temparature is: " + decimalFormat.format(fahrenheit));
	}

}
