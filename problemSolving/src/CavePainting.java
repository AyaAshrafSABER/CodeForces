import java.util.ArrayList;
import java.util.Scanner;

public class CavePainting {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		long n = scan.nextLong();
		long m = scan.nextLong();
		ArrayList<Long> modulo = new ArrayList<Long>();
		int i = 1;
		for (; i <= m; i++) {
			if (modulo.contains(n % i)) {
				System.out.println("No");
				return;

			} else {
				modulo.add(n%i);
			}
		}
			System.out.println("Yes");


	}
}
