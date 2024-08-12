package codeStart;

public class IfElse {
	public static void main(String[] args) {
		int a,b,c,d;
		a=19;b=20;c=15;d=18;
		if (a+b > c+d) {
			System.out.println("you are correct");
		}else {
			System.out.println("not good values");
		}
		int ang1,ang2,ang3;
		ang1=10;ang2=90;ang3=80;
		if (ang1+ang2+ang3==180) {
			System.out.println("given values create Triangle");
		}
		if (a%a ==0) {
			System.out.println("given number is even number");			
		}else {
			System.out.println("this is odd number");
		}
	}

}
