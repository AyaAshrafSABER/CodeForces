import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B_RecursiveQueries463 {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int query = scan.nextInt();
		for (int len = 0; len < query; len++) {
			long l = scan.nextLong();
			long r = scan.nextLong();
			int k = scan.nextInt();
			int counter = 0; 
			for (long i = l ; i <= r; i++) {
				if (g(i) == k) {
					counter ++; 
				}
			}
			System.out.println(counter);
		}
	}

	private static int g(long i) {
		if (i / 10 == 0) {
			return (int) i;
		} 
		return g(f(i));
	}

	private static long f(long i) {
		int ans = 1; 
		String temp =String.valueOf(i);
		int len = temp.length();
		int ten = 10 ;
		for (int j = 0 ; j < len ; j++) {
			if ((i % ten)/(ten/10) != 0) {
				ans *= (i % ten)/(ten/10);
			} 	
			ten = ten*10;
		}
		return ans;
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
