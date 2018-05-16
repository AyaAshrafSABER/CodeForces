import java.util.Scanner;

public class DreamoonAndStairs {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scan.nextInt();
		int m = scan.nextInt();
		if (n < m) {
			System.out.println(-1);
		} else {
			boolean flag = true; 
			int multiple = 1; 
			int answer = 1;
			while (flag) {
				answer = m * multiple; 
				if ((n-answer)> answer) {
					multiple ++;	
				}else {
					flag = false; 
				}
			}
			System.out.println(answer);
		}
	}
}
