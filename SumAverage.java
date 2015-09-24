import java.util.Scanner;
public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3, num4, num5;
		System.out.println("Enter five separate numbers to ");
		System.out.println("calculate their sum and average.");
		System.out.println();
		System.out.println("Please enter the first number:");
		Scanner keyboard = new Scanner(System.in);
		num1 = keyboard.nextDouble();
		System.out.println("Please enter a second number:");
		num2 = keyboard.nextDouble();
		System.out.println("Please enter a third number:");
		num3 = keyboard.nextDouble();
		System.out.println("Please enter a forth number:");
		num4 = keyboard.nextDouble();
		System.out.println("Please enter a fifth number:");
		num5 = keyboard.nextDouble();
		keyboard.close();
		
		double sum = num1 + num2 + num3 + num4 + num5;
		double average = sum/5;
		
		System.out.println("The numbers you have entered have a sum of " + sum + " and an average of " + average + ".");
		
	}

}
