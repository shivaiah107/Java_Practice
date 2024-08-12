package codeStart;

public class ForLoopUse {
	public static void main(String[] args) {
		for (int i = 10; i >=1;i--) {
			System.out.print(" "+i);			
		}
		System.out.println();
		for (int i = 1; i <=10; i++) {
			System.out.print(" "+i);			
		}
		System.out.println();
		for (int i = 1; i <=10; i++) {
			System.out.printf("%d * %d = %d",6,i,6*i).println();			
		}
		System.out.println("odd numbers");
		for (int i = 1; i <=10; i=i+2) {
		
			System.out.print(" "+i);			
		}
		System.out.println();
		System.out.println("even numbers");
		for (int i = 10; i >=1;i=i-2) {
			System.out.print(" "+i);			
		}
	}

}
