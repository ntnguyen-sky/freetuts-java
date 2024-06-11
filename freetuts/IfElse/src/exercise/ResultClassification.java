package exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Viết chương trình xếp loại điểm môn học của một sinh viên. 
 * Chương trình yêu cầu người dùng nhập vào 3 cột điểm một môn học của sinh viên 
 * (bao gồm điểm chuyên cần, điểm kiểm tra và điểm thi học kỳ). 
 * Kết quả xếp loại được phân chia như sau:
 * Nếu điểm trung bình >= 8.5 thì xếp loại A.
 * Nếu điểm trung bình >= 7 và nhỏ hơn 8.5 thì xếp loại B.
 * Nếu điểm trung bình >= 5.5 và nhỏ hơn 7 thì xếp loại C.
 * Nếu điểm trung bình >= 4 và nhỏ hơn 5.5 thì xếp loại D.
 * Nếu điểm trung bình < 4 thì xếp loại F.
 * Lưu ý: Điểm trung bình của môn học làm tròn đến 1 chữ số thập phân.
 */
public class ResultClassification {

	public static void main(String[] args) {
		// Create Scanner object to input data
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat decimalFormat = new DecimalFormat("#.#");
		
		// Declare variable
		double diemChuyenCan, diemKiemTra, diemThiHocKy;
		
		// Input data
		System.out.print("Nhập điểm chuyên cần: ");
		diemChuyenCan = scanner.nextFloat();
		System.out.print("Nhập điểm kiểm tra: ");
		diemKiemTra = scanner.nextFloat();
		System.out.print("Nhập điểm học kỳ: ");
		diemThiHocKy = scanner.nextFloat();
		
		// Close object Scanner to avoid memory leaks
		scanner.close();
		
		double averageGrade = (double) ((diemChuyenCan + diemKiemTra + diemThiHocKy)/3);
		
		if (diemChuyenCan<0 || diemKiemTra < 0 || diemThiHocKy < 0) {
			System.out.println("Điểm nhập không hợp lệ!");
		} else {
			String grade = decimalFormat.format(averageGrade);
			double gradeNumber = Double.parseDouble(grade);
			// Classify
			System.out.println("Grade: " + grade);
			if (gradeNumber >= 8.5) {		
				System.out.println("A");
				
			} else if (gradeNumber >= 7.5) { System.out.println("B"); }
			else if (gradeNumber >= 5.5) { System.out.println("C"); }
			else if (gradeNumber >= 4) { System.out.println("D"); }
			else { System.out.println("F"); }
		}
		
	}

}
