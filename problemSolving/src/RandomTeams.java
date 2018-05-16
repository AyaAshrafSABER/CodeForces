import java.util.Scanner;

public class RandomTeams {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		long participants = scan.nextLong();
		long numOfTeams = scan.nextLong();
		long kMin = 0;
		long kMax = (participants - numOfTeams + 1) * (participants - numOfTeams) / 2; // calculate
																						// the
																						// combinatorics
		kMin = numOfTeams * (participants / numOfTeams) * ((participants / numOfTeams) - 1) / 2;
		if ((participants % numOfTeams) != 0) {
			long perGrp = participants / numOfTeams;
			long r = participants % numOfTeams;
			kMin = ((long) perGrp * (perGrp - 1) * (numOfTeams - r)) / 2;
			kMin += ((long) perGrp * (perGrp + 1) * r) / 2;
		}
		System.out.println(kMin + " " + kMax);

	}

}
