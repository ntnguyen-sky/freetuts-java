package execrise;

import java.util.Scanner;

/*
 * Java - Tìm số nguyên m lớn nhất sao cho 1 + 2 + 3 + ... + m < n (n nhập từ bàn phím).
 * 
 * Viết chương trình nhập vào số nguyên n từ bàn phím. Tìm và in ra màn hình số nguyên m lớn nhất sao cho 1 + 2 + 3 + ... + m < n.
 * 
 * Yêu cầu: Chương trình phải kiểm tra và yêu cầu người dùng nhập vào n >= 0.
 */

/*
 * n = 1 ; 1 + ..+ m < n: false => n = 2; 1 + .. + m < 2; m 
 */
public class FindLargestInteger {

	public static void main(String[] args) {
		// Scanner object
		Scanner scanner = new Scanner(System.in);
		
		int n;
		int m = 0;
		int sum = 0;
		// integer => 0
		do {
			System.out.print("Enter the n: ");
			n = scanner.nextInt();
		} while (n < 0);

		
		/*
		 * 1 + 2 + ... + m < n
		 */
		while (sum + m + 1 < n) {
			sum += ++m;
			// 1 + 2 + .. + m  = sum
			printSumProcess(m,sum);
		}
		
		System.out.println("\nm: " + (m));
		
		// Scanner close
		scanner.close();
	}
	
	public static void printSumProcess(int m, int sum) {
		for (int i = 1; i <= m; i++) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }
        }
        System.out.println(" = " + sum);
	}

}
