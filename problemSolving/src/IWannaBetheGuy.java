

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IWannaBetheGuy {
	static FastScanner scan = new FastScanner(System.in);
	static ArrayList<Integer> leveles = new ArrayList<Integer>();
	public static void main(String[] args) {
		int n = scan.nextInt();
		int PLevels = scan.nextInt();
		takeLevels(PLevels);
		int Qlevels = scan.nextInt(); 
		takeLevels(Qlevels);
		if (leveles.size() == n) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");

		}
		
	}
	static void takeLevels(int input){
		for (int i = 0 ; i< input; i++) {
			int temp = scan.nextInt();
			if (!(leveles.contains(temp))) {
				leveles.add(temp);
			}
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
