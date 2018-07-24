import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AliBaba {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			int diamonds = scan.nextInt();
			int days = scan.nextInt();
			ArrayList<Integer> weight = new ArrayList<Integer>();
			ArrayList<Integer> salaryPerDay = new ArrayList<Integer>();
			for (int i = 0; i < diamonds; i++) {
				weight.add(scan.nextInt());
			}
			for (int i = 0; i < days; i++) {
				salaryPerDay.add(scan.nextInt());
			}
			Collections.sort(weight);
			Collections.reverse(weight);			Collections.reverse(salaryPerDay);
			Collections.sort(salaryPerDay);
			Collections.reverse(salaryPerDay);

			int sum = 0; 
			for (int i = 0; i < days && i < diamonds; i++) {
				sum += salaryPerDay.get(i)*weight.get(i);
			}
			System.out.println(sum);
			
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
