import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class problemJ {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			long emp = scan.nextLong();
			long num1 = scan.nextLong();
			long num2 = scan.nextLong();
			long num3 = scan.nextLong();
			
			long counter = Math.min(num1,Math.min(num2, num3));
			long idTaken = 0;
			long i = counter;
			Set<Long> multiple = new HashSet<>();
			long sum1 = 0; 
			long sum2 = 0;
			long sum3 = 0;
			while (idTaken < emp) {
				sum1 += num1;
				sum2 += num2;
				sum3 += num3;
				multiple.add(sum1);
				multiple.add(sum2);
				multiple.add(sum3);
					idTaken++;
			}
			List<Long> sortedList = new ArrayList(multiple);
			Collections.sort(sortedList);
			System.out.println(sortedList.get((int) emp - 1));
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
