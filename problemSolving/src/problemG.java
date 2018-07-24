import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class problemG {
	static FastScanner scan = new FastScanner(System.in);
	static public Map<Character, Integer> map1 = new HashMap<Character, Integer>();
	static public Map<Character, Integer> map2 = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			createMap(map1);
			createMap(map2);
			int size = scan.nextInt();
			String s = scan.next();
			for (int i = 0; i < size; i++) {
				int action = map1.get(s.charAt(i)) + 1;
				map1.put(s.charAt(i), action);
			}
			int odds1 = 0;
			int odds2 = 0;
			int possible = 0;
			char a = 'a';
			for (int i = 0; i < 26; i++) { // count odds
				if (map1.get(a) > 0) {
					if (map1.get(a) % 2 == 1) {
						odds1++;
					}
				}
				a++;
			}
			for (int i = 0; i < size - 1; i++) { // loop string
				int action = map2.get(s.charAt(i)) + 1;
				map2.put(s.charAt(i), action);
				action = map1.get(s.charAt(i)) - 1;
				map1.put(s.charAt(i), action);
				if (map1.get(s.charAt(i)) % 2 == 0) {
					odds1--;
				} else {
					odds1++;
				}
				if (map2.get(s.charAt(i)) % 2 == 1) {
					odds2++;
				} else {
					odds2--;
				}
				if (odds1 <= 1 && odds2 <= 1) {
					possible++;
				}
			}
			System.out.println(possible);
		}

	}

	public static Map<Character, Integer> createMap(Map<Character, Integer> map) {
		char a = 'a';
		for (int i = 0; i < 26; i++) {
			map.put(new Character(a), 0);
			a++;
		}
		return map;
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
