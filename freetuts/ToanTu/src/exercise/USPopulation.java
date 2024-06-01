package exercise;

import java.text.DecimalFormat;

/*
 * Cục điều tra dân số Hoa Kỳ dự báo dân số năm tiếp theo dựa trên giả định sau:
 * Cứ 7 giây là có 1 trẻ em được sinh ra,
 * 13 giây là có 1 người qua đời
 * và 45 giây là có 1 người nhập cư.
 * 
 * Hãy viết chương trình tính toán dân số của Hoa Kỳ trong 5 năm tiếp theo
 * và hiển thị số dân của từng năm.
 * Giả sử số dân hiện tại của Hoa Kỳ là 312,032,486 người
 * và một năm có 365 ngày. Kết quả được làm tròn đến 2 chữ số thập phân.
 */
public class USPopulation {
	
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		// One year
		double child = (double) (365 * 24 * 60 * 60) / 7;
		double die = (double) (365 * 24 * 60 * 60) / 13;
		double immigration = (double) (365 * 24 * 60 * 60) / 45;
		
		double currentPopulation = 312032486;
		System.out.println("Current Population: " + decimalFormat.format(currentPopulation));
		
		// Five years
		for (int i = 1; i<=5; i++) {
			currentPopulation += child - die + immigration;
			System.out.println("Population of US in " + i + " is: " + decimalFormat.format(currentPopulation));
		}
	}

}
