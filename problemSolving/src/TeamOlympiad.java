import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class TeamOlympiad {
	static FastScanner scan = new FastScanner(System.in);
	public static void main(String[] args) {
		int numOfStudent = scan.nextInt();
		ArrayList<Student> ones = new ArrayList<Student>();
		ArrayList<Student> twos = new ArrayList<Student>();
		ArrayList<Student> threes = new ArrayList<Student>();
		int maxOnes = 0;
		int maxTwos = 0;
		int maxThrees = 0; 
		for (int i = 0; i < numOfStudent; i++) {
			int good = scan.nextInt();
			Student temp = new Student(i + 1,good);
			if (good == 1) {
				maxOnes ++;
				ones.add(temp);
			}else if (good == 2) {
				maxTwos ++;
				twos.add(temp);
			} else {
				maxThrees ++;
				threes.add(temp);
			}			
		}
		int maxGroup = Math.min(Math.min(maxOnes, maxTwos), maxThrees);
		System.out.println(maxGroup);
		for (int i = 0; i<maxGroup; i++) {
			System.out.println(ones.get(i).index + " "+ twos.get(i).index+" "+threes.get(i).index + " " );		
		}

		
	}
	static class sortByGoodAt implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.goodAt - o2.goodAt;
		}
		
	}
	static class Student {
		int index; 
		int goodAt;
		public Student (int index, int goodAt) {
			this.index = index;
			this.goodAt = goodAt;
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
