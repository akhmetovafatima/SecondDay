
public class Main_Plane {

	public static void main(String[] args) {
		CreatePlane plane = new CreatePlane("Boeing",2016,20000);
		plane.setPrice(10000);
		plane.color = "white";
		System.out.println(plane.getBrand());
		System.out.println(plane.getPrice());
		System.out.println(plane.color);
		System.out.println(plane.getYear());

	}

}
