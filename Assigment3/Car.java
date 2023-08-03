class Car extends Vehicle {
    private String make;
    private String model;

    // Default constructor
    public Car() {
        super(10000, 2023, 0.15);
        this.make = "Unknown";
        this.model = "Unknown";
    }

    // Parameterized constructor
    public Car(String make, String model, int price, int year, double rate) {
        super(price, year, rate);
        this.make = make;
        this.model = model;
    }

    // Setters
    public void setMake(String new_make) {
        this.make = new_make;
    }

    public void setModel(String new_model) {
        this.model = new_model;
    }

    // Getters
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    // Same method as in parent class but overriden
    @Override
    public double calculateDepreciation() {
        // Let's say cars depreciate once every 2 years
        return super.getPrice() * Math.pow((1 - super.getDepreciationRate()), Math.floor((2023 - super.getYear()) / 2));
    }

    @Override
    public String toString() {
        return super.toString() + "\nMake: " + this.make + "\nModel: " + this.model;
    }
}
