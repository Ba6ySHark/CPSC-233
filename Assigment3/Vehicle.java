import java.lang.Math;

class Vehicle {
    private int price;
    private int year;
    private double depreciationRate; // per year

    // Default constructor
    public Vehicle() {
        this.price = 1;
        this.depreciationRate = 0.1;
    }

    // Parameterized constructor
    public Vehicle(int price, int year, double depreciationRate) {
        this.setPrice(price);
        this.setYear(year);
        this.setDepreciationRate(depreciationRate);
    }

    // Setters
    public void setPrice(int new_price) {
        if (new_price >= 0) {
            this.price = new_price;
        } else {
            System.out.println("Price should be greater than 0");
        }
    }

    public void setYear(int new_year) {
        if (new_year <= 2023) {
            this.year = new_year;
        } else {
            System.out.println("Invalid year");
            this.year = 2023;
        }
    }

    public void setDepreciationRate(double new_rate) {
        if (new_rate >= 0 && new_rate <= 1) {
            this.depreciationRate = new_rate;
        } else {
            System.out.println("Depreciation rate should be a number between 0 and 1");
            this.depreciationRate = 0.0;
        }
    }

    // Getters
    public int getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public double getDepreciationRate() {
        return this.depreciationRate;
    }

    // Method that calculates something
    public double calculateDepreciation() {
        // Let's say unspecified vehicle depreciates every year
        return this.price * Math.pow((1 - this.depreciationRate), 2023 - this.year);
    }

    // String representation of the object
    @Override
    public String toString() {
        return "Price: " + this.price + "\nYear: " + this.year + "\nDepreciation rate: "
                + this.depreciationRate;
    }
}