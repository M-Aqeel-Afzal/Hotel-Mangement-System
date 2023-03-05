package AqeelAfzal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	
	Scanner input_command = new Scanner(System.in);
    System.out.println("\nHello Welcome to Super Luxury Hotel");
    System.out.println("\nDo you want to reserve Room");
    System.out.println("\nDo you want to book Room");
    System.out.println("\nGet all Available Rooms");
    System.out.println("\nAdd a new Room");
    System.out.println("\nFind a specific Guest by the key number");
    int index=0;
    boolean check=false;
    do {
    index = input_command.nextInt();
    switch(index)
    {
    case 1:
    	
    	break;
    case 2:
    	break;
    case 3:
    	break;
    case 4:
    	break;
    case 5:
    	break;
    case 6:
    	break;
    case 7:
    	check=true;
    	break;
    }
    }while(!check);
    System.out.println("\nThanks For Comming!!!!");
     	
    }
	
}
