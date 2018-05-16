import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A_WordCorrection {
	static FastScanner scan = new FastScanner(System.in);
	public static void main(String[] args) {
		final ArrayList<Character> vowels = new ArrayList<>();
		vowels.add('a'); 
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('y');
		int n = scan.nextInt();
		String s = scan.next();
		ArrayList<Character> word = new ArrayList<>();
		for (int i = 0; i < n ; ) {
			word.add(s.charAt(i));
			if (vowels.contains(s.charAt(i))) {
				i++;
				while ( i < n && vowels.contains(s.charAt(i))) {
					i++;
				}
			} else {
			i++;
			}
		}
		for (int i = 0; i < word.size() ; i++) {
			System.out.print(word.get(i));
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
		long nextLong() {
			return Long.parseLong(next());

		}
	}
}
