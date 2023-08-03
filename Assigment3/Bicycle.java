class Bicycle extends Vehicle {
    private int wheelSize; // in inches
    private String color;

    // Default constructor
    public Bicycle() {
        this.wheelSize = 24;
        this.color = "Unknown";
    }

    // Parameterized constructor
    public Bicycle(int size, String color, int price, int year) {
        // Let's assume bicycles have 0 depreciation rate
        super(price, year, 0.0);
        this.setWheelSize(size);
        this.color = color;
    }

    // Setters
    public void setWheelSize(int new_size) {
        if (new_size > 0 && new_size < 100) {
            this.wheelSize = new_size;
        } else {
            System.out.println("Invalid wheel size");
        }
    }

    public void setColor(String new_color) {
        this.color = new_color;
    }

    // Getters
    public int getWheelSize() {
        return this.wheelSize;
    }

    public String color() {
        return this.color;
    }

    // Same method as in parent class but overriden
    @Override
    public double calculateDepreciation() {
        // Let's say bicycles depreciate 50% after purchase and don't lose any value
        // afterwards
        return super.getPrice() * 0.5;
    }

    @Override
    public String toString() {
        return super.toString() + "\nWheel Size: " + this.wheelSize + "\nColor: " + this.color;
    }
}
