import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class problemD {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scan.nextInt();
			ArrayList<Integer> ss = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				ss.add(scan.nextInt());
			}
			Collections.sort(ss);
			int sum = 0;
			int pelanty = 0;
			int i = 0;
			for (; i < n; i++) {
				sum += ss.get(i);
				if (sum <= 300) {
					pelanty = sum +pelanty;
					
				}
				else {
					break;
				}
			}
			System.out.println( i + " " + pelanty);
			
			
			
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
