import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SeatArrangements {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		char[][] classroom = new char[n][m];
		for (int i = 0; i < n; i++) {
			String temp = scan.next(); 
			for (int j = 0; j < m; j++) {
				classroom[i][j] = temp.charAt(j);
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				char temp = classroom[i][j];
				if (temp == '.') {
					int prob = 1;
					for (int s = i + 1; s < n; s++) {
						if (temp == classroom[s][j]) {
							prob++;
						} else {
							break;
						}
					}
					if (prob >= k) {
						count ++;
					}
					prob = 1;
					for (int l = j + 1; l < m; l++) {
						if (temp == classroom[i][l]) {
							prob++;
						} else {
							break;
						}
					}
					if (prob >= k) {
						count ++;
					}
				}
			}
		}
		System.out.println(count);
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
