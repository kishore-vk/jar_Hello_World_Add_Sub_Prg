package demo.helloworld;

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(printOne());
		int b = Main1.add();
		System.out.println(b);
		@SuppressWarnings("unused")
		int k = Main.sub();
	}

	public static String printOne() {
		String bs;
		bs = "Hello! Have a great weekend";
		return bs;
	}

	public static int sub() {
		System.out.print("Subraction: Enter first number: ");
		int firstNumber = s.nextInt();
		System.out.print("Subraction: Enter second number: ");
		int secondNumber = s.nextInt();
		int sub = firstNumber - secondNumber;
		System.out.println("The result of Subraction is " + sub);
		return sub;
	}

}