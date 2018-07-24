import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class GeometricePizza {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = scan.nextInt();

		for (int i = 0; i < tests; i++) {
			int len = scan.nextInt();
			float max = -1;
			int row = 0;
			for (int j = 0 ; j < len ; j++) {
				float result = 0; 
				float l = scan.nextFloat();
				float angle = scan.nextFloat();
				float price = scan.nextFloat();
				result = (l * l * (angle/360)) / price;
				if (max < result) {
					max = result;
					row = j+1; 
				}
			}
			System.out.println(row);


		}
	}

	

}
