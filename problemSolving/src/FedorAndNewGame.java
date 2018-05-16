import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class FedorAndNewGame {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		ArrayList<Integer> soldier = new ArrayList<Integer>();
		for (int i = 0; i < m ; i++) {
			soldier.add(scan.nextInt());
		}
		int fedor = scan.nextInt();
		int counter = 0;
		for (int i = 0; i < m ; i++) {
			int numOfOnes = Integer.bitCount(soldier.get(i)^fedor);
			if (numOfOnes <= k) {
				counter ++;
			}
		}
		System.out.println(counter);
	
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
