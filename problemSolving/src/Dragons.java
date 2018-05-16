import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Dragons {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int strength = scan.nextInt();
		int n = scan.nextInt();
		ArrayList<DragonPoint> nth = new ArrayList<DragonPoint>();
		for (int i = 0; i < n; i++) {
			int xi = scan.nextInt();
			int yi = scan.nextInt();
			DragonPoint dragonPoint = new DragonPoint(xi, yi);
			nth.add(dragonPoint);
		}
		Collections.sort(nth, new sortByDragonsSrength());
		int i;
		for (i = 0; i < n; i++) {
			if (strength > nth.get(i).dragonsSrength) {
				strength += nth.get(i).bonusStrength;
			} else {
				break;
			}
		}
		if (i == n ) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

	private static class sortByDragonsSrength implements Comparator<DragonPoint> {

		@Override
		public int compare(DragonPoint a, DragonPoint b) {
			return a.dragonsSrength - b.dragonsSrength;
		}

	}

	private static class DragonPoint {
		int dragonsSrength;
		int bonusStrength;

		public DragonPoint(int dragonsSrength, int bonusStrength) {
			this.bonusStrength = bonusStrength;
			this.dragonsSrength = dragonsSrength;
		}
	}
}
