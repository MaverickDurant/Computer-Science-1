/*
 * Class: CMSC203 CRN 34164
 * Instructor:Dr. Ahmed Tarek
 * Description: A java application that diagnoses a wifi malfunction that the user if having, it goes through steps for the user to try and fix the problem.   
 * Due: 02/07/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Maverick Durant
*/

//user can type input
import java.util.Scanner;

public class WiFiDiagnosis 
{
	//new scanner for user to type input
	static Scanner scan = new Scanner(System.in);
	// Main method, hold all methods together and ask beginner question
	public static void main(String[] args)
	{
		// Ask user if they want to run diagnostic
		System.out.println("If there is a problem with wifi connectivity, this wifi diagnosis might work.");
		System.out.println("Would you like to run diagnostic? Yes or No");
		Scanner YesNo = new Scanner (System.in);
		String yesno = YesNo.next();
		//If statements to get users input
		if (yesno.equals("yes"))
		{
			System.out.println("Great lets do it.");
		}
		else if (yesno.equals("no"))
		{
			System.out.println("Okay no prolblem");
			System.exit(0);
		}
		//reboot method
		reboot();
		//router method
		router();
		//cables method
		cables();
		//move method
		move();
		//isp method
		isp();
		

	}
	
	//reboot method to ask user to reboot computer
	public static void reboot()
	{
		System.out.println("First try to reboot computer and connect to internet");
		System.out.println("Did this solve the problem? Yes or No: ");
		Scanner YesNo = new Scanner (System.in);
		String yesno = YesNo.next();
		//If statement to get input from user
		if (yesno.equals("yes"))
		{
			System.out.println("Glad to help solve the problem");
			System.exit(0);
		}
		else if (yesno.equals("no"))
		{
			System.out.println("Okay no prolblem, lets try something else.");
		}
	}
	
	//router method to ask user to reboot router
	public static void router()
	{
		System.out.println("Try to reboot router.");
		System.out.println("Did this solve the problem? Yes or No: ");
		Scanner YesNo = new Scanner (System.in);
		String yesno = YesNo.next();
		//If statement to get input from user
		if (yesno.equals("yes"))
		{
			System.out.println("Glad to help solve the problem");
			System.exit(0);
		}
		else if (yesno.equals("no"))
		{
			System.out.println("Okay no prolblem, lets try something else.");
		}
	}
	
	//cables method to ask user to make sure all cables are plugged in
	public static void cables()
	{
		System.out.println("Make sure all cables are plugged into router and every device used.");
		System.out.println("Did this solve the problem? Yes or No: ");
		Scanner YesNo = new Scanner (System.in);
		String yesno = YesNo.next();
		//If statement to get input from user
		if (yesno.equals("yes"))
		{
			System.out.println("Glad to help solve the problem");
			System.exit(0);
		}
		else if (yesno.equals("no"))
		{
			System.out.println("Okay no prolblem, lets try something else.");
		}
	}
	
	//move method to ask user to move computer closer to router
	public static void move()
	{
		System.out.println("Try and move the computer or device closer to router.");
		System.out.println("Did this solve the problem? Yes or No: ");
		Scanner YesNo = new Scanner (System.in);
		String yesno = YesNo.next();
		//If statement to get users input
		if (yesno.equals("yes"))
		{
			System.out.println("Glad to help solve the problem");
			System.exit(0);
		}
		else if (yesno.equals("no"))
		{
			System.out.println("Okay no prolblem, lets try something else.");
		}
	}
	
	//isp method to ask user if they are hooked up to isp
	public static void isp()
	{
		System.out.println("Mkae sure ISP is hooked up to router.");
		System.out.println("Did this solve the problem? Yes or No: ");
		Scanner YesNo = new Scanner (System.in);
		String yesno = YesNo.next();
		//If statement to get users input
		if (yesno.equals("yes"))
		{
			System.out.println("Glad to help solve the problem");
			System.exit(0);
		}
		else if (yesno.equals("no"))
		{
			System.out.println("Okay no problem, best thing to do is to contact your ISP and wifi company.");
		}
	}
}