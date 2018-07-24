import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class MinimumExcludedNumber {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int tests = scan.nextInt();

		for (int i = 0; i < tests; i++) {
			int len = scan.nextInt();

			ArrayList<Integer> numbers = new ArrayList<Integer>();

			for (int j = 0; j < len; j++) {
				numbers.add(scan.nextInt());
			}
			Collections.sort(numbers);

			int mex = 0;
			for (int j = 0; j < len - 1; j++) {
				if (Math.abs(numbers.get(j) - numbers.get(j + 1)) > 1) {
					mex = numbers.get(j) + 1;
					break;
				}
			}
			System.out.println(mex);
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
