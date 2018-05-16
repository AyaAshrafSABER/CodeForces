import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class XeniaAndRingroad {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		long numOfHouses = scan.nextInt();
		long numOfTasks = scan.nextInt();
		long time = 0;
		long last = 1;
		for (long i = 0; i < numOfTasks; i++) {
			long temp = scan.nextInt();
			if (temp >= last) {
				time += (temp - last);
			} else {
				time += ((numOfHouses - last) + 1 + (temp - 1));
			}
			last = temp;
		}
		System.out.println(time);

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
