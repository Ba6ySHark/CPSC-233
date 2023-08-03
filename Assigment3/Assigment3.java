import java.util.ArrayList;

class Assigment3 {
    public static void main(String[] args) {
        ArrayList<Vehicle> array = new ArrayList<Vehicle>();
        array.add(new Vehicle(15000, 2020, 0.05));
        array.add(new Bicycle(27, "White", 500, 2014));
        array.add(new Car("Chevrolet", "Camaro", 30000, 2020, 0.05));

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getClass().getName());
            System.out.println(array.get(i));
            System.out.println("Value after depreciation: " + array.get(i).calculateDepreciation());
            System.out.println("\n");
        }
    }
}