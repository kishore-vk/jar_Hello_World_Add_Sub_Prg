package demo.helloworld;

public class Main1 extends Main {
	
	//Addittion Function
	public static int add() {

		System.out.print("Addition: Enter first number: ");
		int firstNumber = s.nextInt();
		System.out.print("Addition: Enter second number: ");
		int secondNumber = s.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("The result of addition is " + sum);
		return sum;

	}

}
