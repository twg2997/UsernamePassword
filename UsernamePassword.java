import java.util.Scanner;
public class UsernamePassword {

	public static void main(String[] args) {
	String username="", password="", correctusername = "twg2997", correctpassword = "bluechip"
	System.out.println("What is your username?");
	Scanner keyboard = new Scanner(System.in);
	username = keyboard.nextLine();
	if(username.equals("twg2997"))
	{
		System.out.println("Hello " + username + ", please enter your password.");
	}
	else
	{
	System.out.println("Invalid username.");
	}
	password = keyboard.nextLine();
	if(password.equals("bluechip"))
	{
		System.out.println("Welcome, twg2997!");
	}
	else
	{
	System.out.println("Invalid password.");
	}
}
