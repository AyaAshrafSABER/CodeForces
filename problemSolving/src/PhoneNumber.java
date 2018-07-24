
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PhoneNumber {
	static FastScanner scan = new FastScanner(System.in);
	static public Map<Character, Integer> map = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		int t = scan.nextInt();
		for (int j = 0; j < t; j++) {
			createMap();
			String read = scan.next();
			int size = read.length();
			for (int i = 0; i < size; i++) {
				int action = map.get(read.charAt(i)) + 1;
				map.put(read.charAt(i), action);
			}
			String result = "";
			if (map.get('Z') > 0) { //3
				int numberOfZeros =  map.get('Z');
				for (int k = 0 ; k < numberOfZeros; k++) {
					result += "0";  
				}
				map.put('Z', 0);
				map.put('E', map.get('E') - numberOfZeros);
				map.put('R', map.get('R') - numberOfZeros);
				map.put('O', map.get('O') - numberOfZeros);
			}
			if (map.get('W') > 0) { // 2
				int numberOfTwoes =  map.get('W');
				for (int k = 0 ; k < numberOfTwoes; k++) {
					result += "2";  
				}
				map.put('W', 0);
				map.put('T', map.get('T') - numberOfTwoes);
				map.put('O', map.get('O') - numberOfTwoes);
			}
			if(map.get('U') > 0) {
				int numberOfFours =  map.get('U'); // 4 
				for (int k = 0 ; k < numberOfFours; k++) {
					result += "4";  
				}
				map.put('U', 0);
				map.put('F', map.get('F') - numberOfFours);
				map.put('O', map.get('O') - numberOfFours);
				map.put('R', map.get('R') - numberOfFours);
			}
			if(map.get('F') > 0) { // 5 
				int numberOfFive =  map.get('F');  
				for (int k = 0 ; k < numberOfFive; k++) {
					result += "5";  
				}
				map.put('F', 0);
				map.put('I', map.get('I') - numberOfFive);
				map.put('V', map.get('V') - numberOfFive);
				map.put('E', map.get('E') - numberOfFive);
			}
			if(map.get('X') > 0) { // 6
				int numberOfSix =  map.get('X');  
				for (int k = 0 ; k < numberOfSix; k++) {
					result += "6";  
				}
				map.put('X', 0);
				map.put('I', map.get('I') - numberOfSix);
				map.put('S', map.get('S') - numberOfSix);
			}
			if(map.get('V') > 0) { // 7
				int numberOfSix =  map.get('V');  
				for (int k = 0 ; k < numberOfSix; k++) {
					result += "7";  
				}
				map.put('V', 0); //SEVEN
				map.put('E', map.get('E') - numberOfSix);
				map.put('E', map.get('E') - numberOfSix);
				map.put('S', map.get('S') - numberOfSix);
				map.put('N', map.get('N') - numberOfSix);
			}
			if(map.get('G') > 0) { // 8
				int numberOfSix =  map.get('G');  
				for (int k = 0 ; k < numberOfSix; k++) {
					result += "8";  
				}
				map.put('G', 0); //EIGHT
				map.put('E', map.get('E') - numberOfSix);
				map.put('I', map.get('I') - numberOfSix);
				map.put('H', map.get('H') - numberOfSix);
				map.put('T', map.get('T') - numberOfSix);
			}
			if(map.get('I') > 0) { // 9
				int numberOfSix =  map.get('I');  
				for (int k = 0 ; k < numberOfSix; k++) {
					result += "9";  
				}
				map.put('I', 0); 			//NINE
				map.put('N', map.get('N') - numberOfSix);
				map.put('N', map.get('N') - numberOfSix);
				map.put('E', map.get('E') - numberOfSix);
			}
			if(map.get('O') > 0) { // 1
				int numberOfSix =  map.get('O');  
				for (int k = 0 ; k < numberOfSix; k++) {
					result += "1";  
				}
				map.put('O', 0); //ONE
				map.put('N', map.get('N') - numberOfSix);
				map.put('E', map.get('E') - numberOfSix);
			}
			if(map.get('R') > 0) { // 3
				int numberOfSix =  map.get('R');  
				for (int k = 0 ; k < numberOfSix; k++) {
					result += "3";  
				}
				map.put('R', 0); 			//THREE
				map.put('T', map.get('T') - numberOfSix);
				map.put('H', map.get('H') - numberOfSix);
				map.put('E', map.get('E') - numberOfSix);
				map.put('E', map.get('E') - numberOfSix);
			}
			char tempArray[] = result.toCharArray();
			Arrays.sort(tempArray);
			result = new String(tempArray);
			System.out.println(result);		
		}

	}

	public static Map<Character, Integer> createMap() {
		char a = 'A';
		for (int i = 0; i < 26; i++) {
			map.put(new Character(a), 0);
			a ++;
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
