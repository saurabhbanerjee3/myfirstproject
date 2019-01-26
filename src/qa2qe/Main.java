package qa2qe;

//import java.text.DecimalFormat;
import java.util.Scanner;
//This is for Access Contrl LC-2 
public class Main {

	public static void main(String[] args)
	{
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number of shipments :");
	int NoOfShipment= Integer.parseInt(scan.nextLine());
	String[] shipperName = new String [NoOfShipment];
	String[] ModeTrans = new String [NoOfShipment];
	String[] aPort = new String [NoOfShipment];
	String[] dPort = new String [NoOfShipment];
	Float [] transweight = new Float [NoOfShipment]; 
    Shipment[] ship = new Shipment[NoOfShipment];
	for (int i=0; i<NoOfShipment; i++)
	{
		System.out.println("Enter the shipment "+(i+1)+" details");
	    System.out.println("Enter the shipper name :");
	    shipperName[i]=scan.nextLine();
	    System.out.println("Enter the mode of transportation :");
	    ModeTrans[i] = scan.nextLine();
	    System.out.println("Enter the total weight :");
	    transweight[i] =   Float.parseFloat(scan.nextLine());
	    System.out.println("Enter the arrival port :");
	    aPort[i] = scan.nextLine();
	    System.out.println("Enter the departure port :");
	    dPort[i] = scan.nextLine();
	    ship[i] = Shipment.createNewShipment(shipperName[i], ModeTrans[i], transweight[i], aPort[i], dPort[i]); 
	}    scan.close();
	
	System.out.println("Shipment details are"); 
	System.out.format("%-15s%-15s%-25s%-15s%-20s%s","Id", "Shippername", "Mode of transportation", "Total weight", "Arrival port", "Departure port"); 
	System.out.println(); 
	for (int i=0; i<NoOfShipment; i++) 
	System.out.println(ship[i].toString()); 
}
}