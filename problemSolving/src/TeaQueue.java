import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;


public class TeaQueue {
	static FastScanner scan = new FastScanner(System.in);
	public static void main(String[] args) {
		int query = scan.nextInt();
		ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < query; i++) {
			int numOfStudent = scan.nextInt();
			ArrayList<Student> seconds = new ArrayList<Student>();
			for (int j = 0; j< numOfStudent; j++) {
				Student student = new Student(scan.nextInt(), scan.nextInt());
				seconds.add(student);
			}
			ArrayList<Integer> tempSolution = new ArrayList<Integer>();

			int totalSeconds = 0; 

			for (int j = 0 ; j < numOfStudent ; j++) {
				if (totalSeconds < seconds.get(j).leave){
					totalSeconds = Math.max( seconds.get(j).come,totalSeconds+1);
					tempSolution.add(totalSeconds);
				}  else {
					tempSolution.add(0);
				}
			}
			solution.add(tempSolution);
		}
		for (int i = 0 ; i < query ; i++) {
			int size = solution.get(i).size();
			for (int j = 0 ; j < size; j++) {
				System.out.print(solution.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	static class sortBycome implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.come - o2.come;
		}
		
	}
	static class Student {
		int come; 
		int leave; 
		public Student (int come,int leave) {
			this.come = come;
			this.leave = leave;
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
