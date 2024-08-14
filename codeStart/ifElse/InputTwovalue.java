package ifElse;

import java.util.Scanner;

public class InputTwovalue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number - ");
		int num1 = sc.nextInt();
		System.out.println("you have entered first value is -"+num1);
		System.out.println("please enter another number - ");
		int num2 = sc.nextInt();
		System.out.println("you have entered second value is -"+num2);
		System.out.println("please enter choice for perform to operate "+"\n 1. addition"+"\n 2. subtraction"+"\n 3. Multiplication"+"\n 4. divison");
		int choice = sc.nextInt();
		 int num3;
		if (choice == 1) {
			 num3 =num1+num2;
		}else if (choice == 2) {
			 num3 = (num1-num2);
		}else if (choice == 3) {
			 num3 = (num1*num2);
		}else  {
			 num3 = (num1/num2);
		}
		System.out.println("you have entered first value is -"+num1);
		System.out.println("you have entered second value is -"+num2);
		System.out.println("the result of your choice "+choice+" of two numbers is "+num3);
		
	}
	

}
