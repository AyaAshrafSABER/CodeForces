import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class A_PalindromicSupersequence463 {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		String A = scan.next();
		String B = "";
		Deque<Character> palendrom = new LinkedList<Character>();
		int len = A.length();
		int j = len/2 ;
		if (len % 2 != 0) {
			palendrom.add(A.charAt(len / 2));
			j = len/2 +1;
		}
		for (int i =len/2-1;i >= 0; i--) {
			if (A.charAt(i) == A.charAt(j)) {
				palendrom.addFirst(A.charAt(i));
				palendrom.addLast(A.charAt(i));
				j++;
			} else {
				palendrom.addFirst(A.charAt(i));
				palendrom.addLast(A.charAt(i));
			}
		} 
		while (j < len) {
			palendrom.addFirst(A.charAt(j));
			palendrom.addLast(A.charAt(j));
			j++;
		}

		while (!palendrom.isEmpty()){
			B += palendrom.pop();
		}
		System.out.println(B);

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
