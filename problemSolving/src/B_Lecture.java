import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Lecture {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int m = s.nextInt();
		Map<String, String> ss = new HashMap<String, String>();
	    s.nextLine();
		for (int i = 0; i < m; i++) {
			String[] splitStr = s.nextLine().split("\\s+");
			ss.put(splitStr[0], splitStr[1]);
		}
		String[] splitStr = s.nextLine().split("\\s+");
		for (int i = 0; i <splitStr.length; i++) {
			if (ss.get(splitStr[i]).length() < splitStr[i].length()) {
				System.out.print(ss.get(splitStr[i])+ " ");
			} else {
				System.out.print(splitStr[i]+ " ");
			}
		}
	}
}
