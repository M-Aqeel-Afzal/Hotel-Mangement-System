package AqeelAfzal;

import java.util.Scanner;

public class Guests {
	private String  name, address,gender,date;
	private int age;
	Guests()
	{
		  name="";
		  address="";
		  gender="";
		  date="";
		  age=0;
	}
	
	void setname(String n)
	{
		name=n;
	}
	String getname()
	{
		return name;
	}
	void setaddress(String a)
	{
		address=a;
	}
	String getaddress()
	{
		return address;
	}
	
	void reserveRoom()
	{
		Scanner input_command = new Scanner(System.in);
		   System.out.println("\nEnter your name");
		   name = input_command.next();
		   System.out.println("\nEnter your Address");
		   address = input_command.next();
		   System.out.println("\nEnter your Gender(M/F)");
		   address = input_command.next();
		   System.out.println("\nEnter your Age");
		   age = input_command.nextInt();
		   System.out.println("\nEnter your date on which you want to reserve room(format:  5-April-2021)");
		   date = input_command.next();
		   Rooms obj=new Rooms();
		   Services obj1=new Services();
		   System.out.println("\nAvailable Rooms are");
		   obj.Available_Rooms();
		   System.out.println("\nEnter the room you want to book");
		   obj.room= input_command.next();
		   System.out.println("\nWhat type of services are you going to use");
		   obj1.Services();
		   System.out.println("\nEnter your Services Details");
		   obj1.services=input_command.next();
	}
		

}
