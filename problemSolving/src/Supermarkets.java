import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Supermarkets {
	static FastScanner scan = new FastScanner(System.in);
	public static void main(String[] args) {
		int numOfSupermarkets = scan.nextInt();
		int numOfApples = scan.nextInt();
		ArrayList<Double> priceOfKilo = new ArrayList<Double>();
		for (int i = 0; i < numOfSupermarkets ; i++) {
			double a = scan.nextInt();
			double  b = scan.nextInt();
			priceOfKilo.add((a/b));
		}
		Collections.sort(priceOfKilo);
		System.out.println(priceOfKilo.get(0)*numOfApples);
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
