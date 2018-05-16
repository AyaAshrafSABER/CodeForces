import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A_Cakeminator {
	static FastScanner scan = new FastScanner(System.in);

	public static void main(String[] args) {
		int row = scan.nextInt();
		int column = scan.nextInt();
		char[][] rec = new char[row][column];
		boolean[][] visited = new boolean[row][column];
		for (int i = 0; i < row; i++) {
			String temp = scan.next();
			for (int j = 0; j < column; j++) {
				rec[i][j] = temp.charAt(j);
				visited[i][j] = false;
			}
		}
		int counter = 0;
		for (int i = 0; i < row; i++) {
			int valedCells = 0;
			for (int j = 0; j < column; j++) {
				if (rec[i][j] == 'S') {
					break;
				} else {
					valedCells++;
				}
			}
			if (valedCells == column) {
				for (int j = 0; j < column; j++) {
					if (!visited[i][j]) {
						visited[i][j] = true;
						counter++;
					}
				}
			}
		}

		for (int j = 0; j < column; j++) {
			int valedCells = 0;
			for (int i = 0; i < row; i++) {
				if (rec[i][j] == 'S') {
					break;
				} else {
					valedCells++;
				}
			}
			if (valedCells == row) {
				for (int i = 0; i < row; i++) {
					if (!visited[i][j]) {
						visited[i][j] = true;
						counter++;
					}
				}
			}
		}
		System.out.println(counter);

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
