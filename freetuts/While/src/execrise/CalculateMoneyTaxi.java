package execrise;

import java.util.Scanner;

/*
 * Viết hàm tính tiền đi taxi Mai Linh với số km đi được nhập từ bàn phím, biết:
 * 
 * Giá mở cửa: 14.000đ/ 0.8km.
 * 
 * Tiếp theo đến 25km: 16.300đ/ km.
 * 
 * Từ km thứ 26: 13.300đ/ km.
 */
public class CalculateMoneyTaxi {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Input data
		System.out.print("Enter the number of km: ");
		int km = scanner.nextInt();
		
		final double STARING_FEE = 14000;
		final double NEXT_TO_25KM = 16300;
		final double FROM_26KM_ONWARDS = 13300;
		double price;
		
		while (km <= 0) {
			System.out.print("Enter the number of km:");
			km = scanner.nextInt();
		}
		
		if (km <= 0.8) {
			System.out.println("Price: " + STARING_FEE);
		} else if (km > 0.8 && km < 26) {
			price = (double) (STARING_FEE + ((km - 0.8) * NEXT_TO_25KM));
			System.out.println("Price: " + price);
		} else {
			price = (double) ( STARING_FEE + ((25 - 0.8) * NEXT_TO_25KM ) + ( (km - 0.8 - 25) * FROM_26KM_ONWARDS));
			System.out.println("Price: " + price);
		}
		
		// Close scanner to avoid memory leak
		scanner.close();
	}

}
