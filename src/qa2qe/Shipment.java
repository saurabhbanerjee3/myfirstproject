package qa2qe;

public class Shipment {
	//This is for Access Contrl LC-2 
    private int id;
    private String shipperName;
    private String modeOfTransportation;
    private Float totalWeight;
    private String arrivalPort;
    private String departurePort;
    static int nextShipmentId = 1000;
	 
    public Shipment  (int id, String shipperName, String modeOfTransportation,float totalWeight,String arrivalPort,String departurePort)
    {
    	this.id=id;
    	this.shipperName=shipperName;
    	this.modeOfTransportation=modeOfTransportation;
    	this.totalWeight=totalWeight;
    	this.arrivalPort=arrivalPort;
    	this.departurePort=departurePort;
    }
  
    public static Shipment createNewShipment(String shipperName,String modeOfTransportation,Float totalWeight,String arrivalPort,String departurePort)
    {
    	Shipment returnValue = new Shipment (++nextShipmentId,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort );
		return returnValue;
    }
    @Override 
    
    public String toString()
    {
        if (this.totalWeight %1 ==0){
        	return String.format(("%-15d%-15s%-25s%-15s%-20s%s"),this.id,
        	this.shipperName,
        	this.modeOfTransportation,
              this.totalWeight+ "Kg",
        	this.arrivalPort,this.departurePort);
        	}
        	else
        	{
        	return String.format(("%-15d%-15s%-25s%-15s%-20s%s"),this.id,
        	this.shipperName,
        	this.modeOfTransportation,
        	this.totalWeight+ "Kg",
        	this.arrivalPort,this.departurePort);    

    	//return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,(int)this.totalWeight+ "Kg",this.arrivalPort,this.departurePort);
    }
      
    }
}

