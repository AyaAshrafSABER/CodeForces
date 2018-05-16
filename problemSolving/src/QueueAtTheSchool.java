import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueueAtTheSchool {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int numOfStudent = scan.nextInt();
		int seconds = scan.nextInt();
		char[] students = new char[numOfStudent];
		String temp = scan.next();
		for (int i = 0; i < numOfStudent; i++) {
			students[i] = temp.charAt(i);
		}
		for (int j = 0; j < seconds; j++) {
			for (int i = 0; i < numOfStudent - 1;) {
				if (students[i] == 'B' && students[i + 1] == 'G') {
					students[i] = 'G';
					students[i + 1] = 'B';
					i += 2;
				} else {
					i++;
				}
			}
		}
		for (int i=0 ; i<numOfStudent ; i++) {
			System.out.print(students[i]);
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
