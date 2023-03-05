package AqeelAfzal;
import java.util.Scanner;

public class Rooms {
	
	protected String room="";
	
	void  Available_Rooms() {
		System.out.println("\nNumber of Rooms are");
		int []Array= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
		for(int i=0;i<Array.length;i++)
		{
			if (i>=0||i<5)
			{
				System.out.println("\nRoom "+Array[i]+"is on floor 1 ");
				
			}
			if (i>=5||i<10)
			{
				System.out.println("\nRoom "+Array[i]+"is on floor 2");
				
			}
			if (i>=10||i<15)
			{
				System.out.println("\nRoom "+Array[i]+"is on floor 3");
				
			}
			if (i>=15||i<20)
			{
				System.out.println("\nRoom "+Array[i]+"is on floor 4");
				
			}
			
		}
		
		
	}
	void AddRoom()
	{
		
		System.out.println("\nManager please enter the Password  Hint:: manager");
		String password=" ";
		Scanner input_command = new Scanner(System.in);
		password=input_command.next();
		if (password.equals("manager"))
		{
		
				
		}
		else
		{
			System.out.println("\nYour Identity is not clear");
		}
		
		
		
	}
	
	
	

}
