package AccessControl;
import java.util.Scanner;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int id;
		String name="";
		String PortofOrigin="";
		String country="";
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of ports");
		int Pcount= Integer.parseInt(scan.nextLine());
		Port[] port = new Port[Pcount];
	    for (int i = 0; i < Pcount; i++)
	    {
	    	System.out.println("Enter the port"+(i+1)+" details");
	    	 id = Integer.parseInt(scan.nextLine());
	    	 name = scan.nextLine();
	    	 System.out.println("Is the port from same country[Y/N]");
	    	 PortofOrigin=scan.nextLine();
	    	 if (PortofOrigin.equalsIgnoreCase("N"))
	    	 {
	    		 System.out.println("Enter the country");
	    		 country = scan.nextLine();
	    		 
	    	 }else country = "India";
	    	 port[i] = Port.createRecord(id, name, country);
	    }
	    System.out.println("The port details are");
	    System.out.format(("%-15s %-15s %-15s%n"), "Id", "Name", "Country");

	    for (int i = 0; i < Pcount; i++)
	    {
	    	System.out.println(port[i].toString());
	    }scan.close();
	  
	  	   
	  
	}

}
