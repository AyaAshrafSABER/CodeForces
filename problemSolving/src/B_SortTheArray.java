import java.util.Scanner;
/*
Being a programmer, you like arrays a lot. For your birthday,
 your friends have given you an array a consisting of n distinct integers.
Unfortunately, the size of a is too small. You want a bigger array! 
Your friends agree to give you a bigger array, 
but only if you are able to answer the following question correctly: 
is it possible to sort the array a 
(in increasing order) by reversing exactly one segment of a?
 See definitions of segment and reversing in the notes.*/
public class B_SortTheArray {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int n = s.nextInt();
		int[] a = new int[n];
	    for (int i = 0; i < n; i++){
	      a[i] = s.nextInt();
	    }
	    int l = 0, r = n - 1;
	    while (l < r && a[l] < a[l + 1]){
	      l++;
	    }
	    while (l < r && a[r - 1] < a[r]){
	      r--;
	    }
	    //reverse array 
	    for (int i = l, j = r; i < j; i++, j--) {
	      int k = a[i];
	      a[i] = a[j];
	      a[j] = k;
	    }
	    boolean sorted = true;
	    for (int i = 1; i < n; i++) {
	      sorted &= a[i - 1] < a[i];
	    }
	    if (sorted){
	      System.out.printf("yes\n%d %d\n", l + 1, r + 1);
	    }
	    else
	      System.out.println("no");
	  }
		
	}
