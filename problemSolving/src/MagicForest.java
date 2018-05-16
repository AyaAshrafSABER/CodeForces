import java.util.Scanner;

public class MagicForest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		long n = scan.nextLong();
		int triple = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				for (int k = j + 1; k <= n; k++) {
					if ((i^j^k) == 0 ) {
						System.out.println( i + " " + "J = " + j+" K = " + k);
						triple++;
					}
				}
			}
		}
		System.out.println(triple);
	}
}
