import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
// wrong answer
public class PerfectNumber {

	static FastScanner scan = new FastScanner(System.in);
	public static void main(String[] args) {
		Integer number = scan.nextInt();
		String k = number.toString();
		int len = k.length();
		ArrayList<Integer> digits = new ArrayList<Integer>();
		ArrayList<Integer> solutions = new ArrayList<Integer>();
		for (int i = len ; i > 0; i--) {
			digits.add((int) (number%(Math.pow(10, i))/(Math.pow(10, i-1))));
		}
		int total = 0 ; 
		for (int i = 0; i< len ;i++){
			total += digits.get(i);
		}
		if (total < 10 ) {
			int out = number*10 + (10- total);
			System.out.println(out);
		} else {
			Collections.sort(digits);
			int out = digits.get(0)*10 + (10 - digits.get(0));
			System.out.println(out);

		}
	}
	
	static class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		FastScanner(InputStream stream) {
			try {
				br = new BufferedReader(new InputStreamReader(stream));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String next() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}
	}
}
