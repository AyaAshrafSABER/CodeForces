import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class TheJoker {
	static FastScanner scan = new FastScanner(System.in);
	static final int TIME_OF_JOKE  = 5; 
	static final int REST  = 10; 
	
	public static void main(String[] args) {
		int n = scan.nextInt();
		int duorationOfParty = scan.nextInt();
		ArrayList<Integer> timeOfSong = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			timeOfSong.add(scan.nextInt());
		}
		int count = 0;
		int totalTime = 0; 
		int i = 0;
		while (!(timeOfSong.isEmpty())) {
			if (totalTime + timeOfSong.get(i) <= duorationOfParty) {
			totalTime += timeOfSong.get(i);
			timeOfSong.remove(i);
			} else {
				count = -1; 
				break; 
			}

			if (totalTime + REST <= duorationOfParty) {
				count += 2;
				totalTime +=TIME_OF_JOKE*2;
			
			} else {
				break;
			}
		}
		if (timeOfSong.isEmpty()) {
			if (totalTime < duorationOfParty) {
				int rest = duorationOfParty - totalTime;
				count += rest/TIME_OF_JOKE;
			}
			System.out.println(count);
		} else {
			System.out.println(-1);
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
