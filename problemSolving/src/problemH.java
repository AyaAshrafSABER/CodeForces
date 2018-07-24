

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class problemH {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scan.nextInt();
			int x = scan.nextInt();
			int k = scan.nextInt();
			int counter = 0;
			for (int i = 0; i < n; i++) {
				int z = scan.nextInt();
				if (z <= x) {
					counter++;
				}
			}
			if (counter >= k) {
				System.out.println("team is happy");

			}else {
				System.out.println("try harder next time");
			}
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
