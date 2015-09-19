import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	double height, width;
	System.out.println("Enter the height and width of ");
	System.out.println("your rectangle to calculate it's perimeter and area.");
	System.out.println();
	System.out.println("What is the height?");
	Scanner keyboard = new Scanner(System.in);
	height = keyboard.nextDouble();
	System.out.println("What is the width?");
	width = keyboard.nextDouble();
	keyboard.close();
																									
																									double perimeter = width * 2 + height * 2;
																									System.out.println("The perimeter of your rectangle is " + perimeter + ".");
																									double area = height * width;
																									System.out.println("\nThe area of your rectangle is " + area + ".");
																									}

																																		}
																																		
