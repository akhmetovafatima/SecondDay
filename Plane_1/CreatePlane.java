
public class CreatePlane {
	private int yearModel;
	private String brand;
	private int priceModel;
	public String color;
	public String getBrand()
	{
		return brand;
	}
    public int getPrice()
    {
    	return priceModel;
    }
    public void setPrice(int price)
    {
    	this.priceModel = price;
    }
    public int getYear()
    {
    	return yearModel;
    }
    public void setYear(int yearModel)
    {
    	this.yearModel = yearModel;
    }
public CreatePlane() {
	color = "white";
}


public CreatePlane(String b, int year, int price) 
{
	yearModel = year;
	brand = b;
	priceModel = price;
	
}

public void startEngine()
{
	System.out.println("BramBram");
}
public static void Function() {
	System.out.println("SkySpace");
	
}
}
