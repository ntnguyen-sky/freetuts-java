package toantu;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TinhDienTichVaTheTichHinhCau {
	// Declare constant PI 3.14f
	public static final float PI = 3.14f;
/**
 * Viết chương trình tính thể tích và diện tích bề mặt của một hình cầu với bán kính r nhập vào từ bàn phím (r > 0). 
 * Kết quả chỉ cần lấy 2 chữ số thập phân. Công thức tính như sau:
 * Thể tích = (4/3) * PI * r3.
 * Diện tích bề mặt = 4 * PI * r2.	
 * làm tròn kết quả 
 * @param args
 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhập vào bán kính hình cầu (r > 0): ");
		float radius = scanner.nextFloat();
		
		// Tính diện tích bề mặt hình cầu
		// Diện tích bề mặt = 4 * PI * r^2.
		/**
		 *  Để làm tròn kết quả với 2 chữ số thập phân các bạn sử dụng lớp DecimalFormat theo cú pháp như sau: 
		 *  DecimalFormat decimalFormat = new DecimalFormat("#.##") 
		 *  với phần sau dấu chấm tương ứng với số chữ số thập phân cần lấy 
		 *  (ở đây chúng ta cần lấy 2 chữ số thập phân nên sẽ sử dụng 2 dấu ##).
		 */
		
		// khai báo lớp DecimalFormat để định dạng số
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		float area = 4*PI*radius*radius;
		System.out.println("Diện tích hình cầu: " + decimalFormat.format(area));
		
		/**
		 * Thể tích hình cầu
		 * Công thức : Thể tích = (4/3) * PI * r^3.
		 * Lưu ý radious đang là số thực còn 4/3 chưa thuộc dạng số thực có thể
		 * sẽ làm ảnh hưởng kết quả. Nên ta phải ép nó về kiểu số thược
		 */
		
		float vol = (float) 4/3 * PI * radius * radius * radius;
		System.out.println("Thê tích hình cầu: " + decimalFormat.format(vol));
		
		scanner.close();
	}

}
