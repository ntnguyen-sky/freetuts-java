package exercise;

import java.util.Scanner;

public class LunarYearFromSolarYear {

	public static void main(String[] args) {
		int solarYear;
		
		// Scanner 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the solar year: ");
		solarYear = scanner.nextInt();
		
		// Close the scanner
		scanner.close();
		
		int canNumber = 0;
		int chiNumber = 0;

		// Thien Can
		if ((solarYear - 3) % 10 == 0) {
			canNumber = 10;
		} else {
			canNumber = (solarYear - 3) % 10;
		}

		// Dia Chi
		if ((solarYear - 3) % 12 == 0) {
			chiNumber = 12;
		} else {
			chiNumber = (solarYear - 3) % 12;
		}

		System.out.println(canNumber + " + " + chiNumber);

		// String Thien Can AND Dia Chi
		String canStr = null;
		String chiStr = null;
		
		switch (canNumber) {
		case 1:
			canStr = "Giáp";
			break;
		case 2:
			canStr = "Ất";
			break;
		case 3:
			canStr = "Bính";
			break;
		case 4:
			canStr = "Đính";
			break;
		case 5:
			canStr = "Mậu";
			break;
		case 6:
			canStr = "Kỷ";
			break;
		case 7:
			canStr = "Canh";
			break;
		case 8:
			canStr = "Tân";
			break;
		case 9:
			canStr = "Nhâm";
			break;
		case 10:
			canStr = "Quý";
			break;
		}

		switch (chiNumber) {
		case 1:
			chiStr = "Tý";
			break;
		case 2:
			chiStr = "Sửu";
			break;
		case 3:
			chiStr = "Dần";
			break;
		case 4:
			chiStr = "Mão";
			break;
		case 5:
			chiStr = "Thìn";
			break;
		case 6:
			chiStr = "Tị";
			break;
		case 7:
			chiStr = "Ngọ";
			break;
		case 8:
			chiStr = "Mùi";
			break;
		case 9:
			chiStr = "Thân";
			break;
		case 10:
			chiStr = "Dậu";
			break;
		case 11:
			chiStr = "Tuất";
			break;
		case 12:
			chiStr = "Hợi";
			break;
		}
		System.out.println(canStr + " + " + chiStr);
	}

}
