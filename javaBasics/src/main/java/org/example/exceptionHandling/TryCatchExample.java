package org.example.exceptionHandling;

public class TryCatchExample {
    public static void main(String[] args) {
        int a = 10 , b = 0;
        try {
            int [] n = {1,2,3};
            System.out.println(n[3]);
            int arithmaticException = a/b;

        } catch (ArithmeticException e) {
            System.out.println("you have encountered  Arithmatic exception " + e);
            //we can have multiple catch blocks for different types of exception
        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("it is causing out of element trying to access "+ e);
        }
    }
}
