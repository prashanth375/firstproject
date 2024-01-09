package venkat_ramesh;

public class Car extends Vehicle {
	
	  private String modelName = "Mustang"; 
	  String name="ramesh";
	
	  public static void main(String[] args) {

	 Car mycar=new Car();
	 mycar.honk();
	 System.out.println("model name car::"+mycar.modelName);
	 System.out.println("name:::"+mycar.name);
	 System.out.println("person name::::"+mycar.personname);
	  }
	}