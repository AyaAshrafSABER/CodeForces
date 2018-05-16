import java.util.Scanner;

public class IlyaAndBankAccount {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		long n = scan.nextLong();
		if (n >= 0) {
			System.out.println(n);
		} else {
			long removeLastdigits = (n/10); 
			long removeBeforeLast = (n/100) * 10 + (n%10);
			if (removeLastdigits > removeBeforeLast) {
				System.out.println(removeLastdigits);
			} else {
				System.out.println(removeBeforeLast);
			}
		}
	}
}
