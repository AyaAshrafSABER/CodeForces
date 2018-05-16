import java.util.Scanner;

public class CloningToys {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		long n = scan.nextLong();
		long m = scan.nextLong();
		if (m > 0 && n > 0 && n >= m-1 ) {	
				n = n - (m - 1);
				if (n % 2 == 0) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}

		} else {
			if (m == 1 && n == 0) {
				System.out.println("Yes");
			} else {
			System.out.println("No");
			}
		}
	}
}
