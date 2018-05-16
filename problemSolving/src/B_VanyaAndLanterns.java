import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_VanyaAndLanterns {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int numOfLatern = scan.nextInt();
		long roadLen = scan.nextLong();
		ArrayList<Long> points = new ArrayList<Long>();
		for (int i = 0; i < numOfLatern ; i++) {
			points.add(scan.nextLong());
		} 
		Collections.sort(points);
		double disFrombeign = points.get(0);
		double disFromLost = roadLen - points.get(points.size() - 1);
		double maxBetweenLat = 0; 
		for (int i =points.size() - 1 ; i > 0 ; i--) {
			double temp = points.get(i) - points.get(i - 1);
			if (temp > maxBetweenLat) {
				maxBetweenLat = temp;
			}
		}
		maxBetweenLat = maxBetweenLat / 2;
		System.out.printf("%.9f", Math.max(Math.max(disFrombeign, disFromLost), maxBetweenLat));
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
		long nextLong() {
			return Long.parseLong(next());

		}
	}
}
