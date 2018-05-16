import java.util.Scanner;

public class CheapTravel {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (m >= n) {
			if (b < n * a) {
				int optimal1 = b;
				System.out.println(optimal1);
			} else {
				System.out.println(n * a);
			}

		} else {
			if (n % m == 0) {
				if (((n / m) * b)<(n*a)) {
					System.out.println((n / m) * b);
				} else {
					System.out.println(n*a);
				}
			} else {
				if (((n / m) * b + (n - (n / m) * m) * a) < ((n / m) * b + b)) {
					System.out.println((n / m) * b + (n - (n / m) * m) * a);
				} else {
					System.out.println(((n / m) * b + b));
				}
			}

		}
	}
}
