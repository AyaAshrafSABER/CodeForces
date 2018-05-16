import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IQtest {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			number.add(scan.nextInt());
		}
		int currentIndex = 0;
		int counter = 0;
		boolean[][] evenless = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			int currentNum = number.get(i);
			for (int j = i + 1; j < n; j++) {
				if ((currentNum - number.get(j)) % 2 != 0) {
					evenless[i][j] = true;
					evenless[j][i] = true;

				}
			}
		}
		for (int i = 0; i < n; i++) {
				currentIndex = i;
 				counter = 0 ;
			for (int j = 0; j < n; j++) {
				if (evenless[i][j] == true) {
					counter++;

				}
			}
			if (counter == n-1) {
				break;
			}
		}
		System.out.println(currentIndex+1);
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
