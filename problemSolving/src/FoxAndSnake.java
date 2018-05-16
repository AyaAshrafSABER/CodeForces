import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FoxAndSnake {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean turnRight = true;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					System.out.print('#');
				}
				System.out.println();
			}
			else {
				if (turnRight) {
					for (int j = 0; j < m-1; j++) {
						System.out.print('.');
					}
					System.out.println('#');
					turnRight = false ;
				} else {
					System.out.print('#');
					for (int j = 0; j < m - 1; j++) {
						System.out.print('.');
					}
					System.out.println();
					turnRight = true ;
				}

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
