public class Vehicle {

	// complete the class definition
	// Do not change anything in the main
	// if you implemented correctly, your code should work properly without any
	// error
	// You should also have the output what you see in the comments of each
	// outputline below

	private String make;
	private String model;
	private int mileage;

	public Vehicle(String make, String model, int mileage) {
		this.make = make;
		this.model = model;
		this.mileage = mileage;
	}

	public Vehicle(Vehicle prototype) {
		this.make = prototype.getMake();
		this.model = prototype.getModel();
		this.mileage = prototype.getMileage();
	}

	public String getMake() {
		return this.make;
	}

	public String getModel() {
		return this.model;
	}

	public int getMileage() {
		return this.mileage;
	}

	public void setMake(String new_make) {
		this.make = new_make;
	}

	public void setModel(String new_model) {
		this.model = new_model;
	}

	public void setMileage(int new_mileage) {
		this.mileage = new_mileage;
	}

	public String getFuelEfficiencyCategory() {
		if (this.mileage > 15) {
			return "best";
		} else if (this.mileage >= 8 && this.mileage <= 15) {
			return "average";
		} else {
			return "worst";
		}
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle("Fiat", "City", 0);
		v.setMileage(20);
		System.out.println("Efficiency for mileage 20 is " + v.getFuelEfficiencyCategory()); // best
		v.setMileage(7);
		System.out.println("Efficiency for mileage 7 is " + v.getFuelEfficiencyCategory()); // worst
		v.setMileage(13);
		System.out.println("Efficiency for mileage 13 is " + v.getFuelEfficiencyCategory()); // average
		Vehicle v2 = new Vehicle("Honda", "CR-V", 30);
		System.out.println("Maker is:  " + v2.getMake()); // Honda
		System.out.println("Model is:  " + v2.getModel()); // CR-V
		System.out.println("Mileage is:  " + v2.getMileage()); // 0

		Vehicle v1 = new Vehicle("Toyota", "Corolla", 10);
		Vehicle v3 = new Vehicle(v1);

		System.out.println("Testin copy constructor make " + v3.getMake()); // Toyota
		System.out.println("Testin copy constructor model " + v3.getModel()); // Corolla
		System.out.println("Testin copy constructor mileage " + v3.getMileage()); // 10

		v3.setModel("Camry");
		System.out.println("Testin copy constructor model " + v3.getModel()); // Camry
		System.out.println("Testin copy constructor model " + v1.getModel()); // Corolla

	}
}