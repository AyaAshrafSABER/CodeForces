import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


public class WaterTheGarden {
	static FastScanner scan = new FastScanner(System.in);
	public static void main(String[] args) {
		int query = scan.nextInt();
		ArrayList<Integer> solution = new ArrayList<Integer>(); 

		for (int i = 0; i < query; i++) {
			int gardenBeds = scan.nextInt();
			int waterTaps = scan.nextInt();
			ArrayList<Integer> watered = new ArrayList<Integer>(); 
			for  (int k = 0; k < gardenBeds; k++) {
				watered.add(0);
			}
			for (int j = 0; j < waterTaps; j++) {
				int temp = scan.nextInt();
				watered.remove(temp-1);
				watered.add(temp-1, 1);
			}
			int count = 1 ;
			while((watered.contains(0))) {
				 
				for (int l = 0 ; l < gardenBeds ; l++) {
					if (watered.get(l) == count) {
						if (l != 0 && watered.get(l-1) == 0) {
							watered.remove(l-1);
							watered.add(l-1, count+1);
						}
						if (l != gardenBeds - 1 && watered.get(l+1) == 0) {
							watered.remove(l+1);
							watered.add(l+1, count+1);
						}
					}
				}
				count++;
			}
			Collections.sort(watered);
			solution.add(watered.get(watered.size()-1));
		}
		for (int i = 0 ; i< query ; i++) {
			System.out.println(solution.get(i));
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
