import java.util.Scanner;

public class PashmakAndGarden {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int x3, y3, x4, y4;
		if (x1 == x2 ) {
			int len = y2 - y1;
			x3 = len + x1;
			y3 = y1;
			x4 = x3; 
			y4 = y2;
			System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
		} else if ( y1 == y2) {
			int len = x2 - x1;
			y3 = len + y1;
			x3 = x1;
			y4 = y3; 
			x4 = x2;
			System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
		} else {
		    
		    if ((Math.abs(x1-x2)==Math.abs(y2-y1))) {
		    	x3 = x1 ;
		    	y3 = y2;
		    	x4 = x2; 
		    	y4 = y1; 
				System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
		    } else {
		    	System.out.println(-1);

		    }
		    
		}
	}
}
