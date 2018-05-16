import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ChoosingTeams {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int n = scan.nextInt();
		int k = scan.nextInt();
		ArrayList<Integer> participation = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int temp = scan.nextInt() + k; 
			if (temp <= 5) {
				participation.add(temp);
			}
		}
		System.out.println(participation.size()/3);
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
