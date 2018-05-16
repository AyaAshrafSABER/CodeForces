

import java.util.Scanner;


public class EvenOdds {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		long n = scan.nextLong(); 
		long seqK = scan.nextLong();
		long evenSeq = n/2;
		long oddSeq = n - evenSeq; 
		// even seq
		if (seqK > oddSeq) {
			seqK = seqK - oddSeq;
			System.out.println(2 *seqK );

		} else {
			seqK--;
			System.out.println(1+ 2 *seqK );
		}
	}

}
