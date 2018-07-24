import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class problemF {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			int n = scan.nextInt();
			int y = scan.nextInt() - 1; // min
			int z = scan.nextInt(); // max
			long x = scan.nextInt(); // total result
			ArrayList<stru> myArray = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				stru myinput = new stru();
				myinput.name = scan.next();
				myinput.results = scan.nextInt();
				myinput.ads = scan.nextInt();
				myArray.add(myinput);
			}
			Collections.sort(myArray, new Ads());
			long totalAdds = 0;
			long counter = 0;
			int i = 0;
			for (; i < n && counter < x; i++) {
				stru myinput = myArray.get(i);
				int check = myinput.results - z - y;
				if (check < 0) {
					myinput.results = z + check;
				}
				if (x - counter < myinput.results) {
					myinput.results = (int) (x - counter);
				}
				counter += myinput.results;
				totalAdds += myinput.results * myinput.ads;
				myinput.taken = true;
			}
			System.out.println(totalAdds + " " + i);
			Collections.sort(myArray, new Results());
			for (int k = 0; k < n; k++) {
				stru myinput = myArray.get(k);
				if (myinput.taken)
					System.out.println(myinput.name + " " + myinput.results);

			}
		}

	}

	static class stru {
		String name;
		int results;
		int ads;
		boolean taken = false;
	}

	static class Ads implements Comparator<stru> {

		public int compare(stru s1, stru s2) {
			int w0 = s1.ads;
			int w1 = s2.ads;

			return (w0 < w1 ? -1 : (w0 == w1) ? 0 : 1);
		}
	}

	static class Results implements Comparator<stru> {

		public int compare(stru s1, stru s2) {
			int w0 = s1.results;
			int w1 = s2.results;

			return (w0 < w1 ? -1 : (w0 == w1) ? 0 : 1);
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
