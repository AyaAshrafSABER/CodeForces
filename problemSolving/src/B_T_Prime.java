import java.util.HashSet;
import java.util.Scanner;
   

 
public class B_T_Prime {
	private static Scanner s = new Scanner(System.in); 
	public static void main(String[] args) {
		 final int MX = 1000000 + 10;
		    boolean[] b = new boolean[MX];

		    for (int i = 2; i < MX; i++) {
		        for (int j = 2 * i; j < MX; j += i) {
		            b[j] = true;
		        }
		    }
		    HashSet<Long> set = new HashSet<Long>();
		    for (int i = 2; i < MX; i++) {
		        if (!b[i]) {
		            set.add((long) i * i);
		        }
		    }
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			long x = s.nextLong();
			 if (set.contains(x)) {
		            System.out.println("YES");
		        } else {
		            System.out.println("NO");
		        }

		}
	}
}
