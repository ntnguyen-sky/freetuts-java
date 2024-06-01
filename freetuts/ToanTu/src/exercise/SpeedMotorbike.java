package exercise;

import java.text.DecimalFormat;

/*
 * 1 người đi xe máy trên quãng đường dài 40km mất 1 giờ, 40 phút và 12 giây.
 * Hãy tính vận tốc của người đó (m/s),
 * biết rằng trong suốt quãng đường vận tốc của người đó là không đổi.
 * Kết quả làm tròn đến 3 chữ số thập phân.
 * 
 * Công thức: v = d/t
 * Trong đó:
 * - v là vận tốc (m/s)
 * - d là khoảng cách di chuyển (m)
 * - t là thời gian di chuyển (s)
 */
public class SpeedMotorbike {

	public static void main(String[] args) {
		Double distanceMeters = (double ) 40 * 1000;
		Double timeSeconds = (double) (1 * 60 * 60) + (40 *60) + 12;
		// Round to 3 decimal places
		DecimalFormat decimalFormat = new DecimalFormat("#.###");
		
		Double speed = (double) distanceMeters / timeSeconds;
		System.out.println("Speed of Motorbike is: " + decimalFormat.format(speed) + " (m/s)");
		
		
	}

}
