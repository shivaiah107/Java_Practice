package codeStart;

import java.util.Iterator;

public class PrintMethod {
	public static void main(String[] args) {
		printNumbers(40);
		System.out.println();
		printNumSqueres(25);
		System.out.println();
		printOddNumbers(50);
		System.out.println();
		printEvenNumbers(50);
		System.out.println();
		printtable(10);
		System.out.println();
		sumOf(20,10);
		
	}
	static void printNumbers(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.print(" "+i);			
		}
		
	}static void printNumSqueres(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.print(" "+ (i*i));			
		}
}
	static void printOddNumbers(int n) {
		for (int i = 1; i <=n; i=i+2) {
			System.out.print(" "+ (i));			
		}
}
	static void printEvenNumbers(int n) {
		for (int i = 2; i <=n; i=i+2) {
			System.out.print(" "+ (i));			
		}
}
	static void printtable(int n) {
		for (int i = 1; i <=n; i++) {
			System.out.printf("%d * %d = %d" ,n,i,(n*i)).println();
			//System.out.println(n +" * " +i+" = "+(n*i));
		}
}
	static void sumOf(int m, int n) {
		int a = m+n;
		System.out.println("total sum of two values is "+a);
		}


}

