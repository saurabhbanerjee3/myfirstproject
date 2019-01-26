package AccessControl;
// This is for Access Control LC-3 
public class Port 

{
 private int id;
 private String name;
 private String country;
	
	public int getId ()
	{
		return id;
	}
 
	public int setId (int id )
	{
		this.id = id;
		return id;
	}
	
	public String getName ()
	{
		return name;
	}
	public String setName (String name )
	{
		this.name = name;
		return name;
	}
	
	public String getCountry ()
	{
		return country; 
	}
	
	public String setCountry (String country)
	{
		this.country = country;
		return country;
	}
	
   public Port (int id,String name)
	{
	this.id = id;
	this.name = name;
	this.country = "India";
	}
	public Port (int id, String name, String country )
	{
		this.id = id;
		this.name = name;
		this.country = country;
		
	}
	public static Port createRecord(int id, String name, String country) {
		Port port = new Port(id, name, country);
		return port;
		}

	
	@Override
	public String toString()
    {
	//System.out.println("The port details are");	
	return String.format("%-15s %-15s %-15s",id,name,country);
	//	System.out.format("%-15s %-15s %-15s",id,name,country);
	 
    }
      
}
