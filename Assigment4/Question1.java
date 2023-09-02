import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Item {
	private String name;
	private double price;
	private int number;
	
	//Default constructor
	public Item() {
		this.name = "Unknown";
		this.price = 0.0;
		this.number = 0;
	}
	
	
	//Parameterized constructor
	public Item(String name, double price, int number) {
		this.name = name;
		this.setPrice(price);
		this.setNumber(number);
	}
	
	//Setters
	public void setName(String new_name) {
		this.name = new_name;
	}
	
	public void setPrice(double new_price) {
		if (new_price > 0.0) {
			this.price = new_price;
		}
		
		else {
			System.out.println("Price should be a positive number");
			System.exit(0);
		}
	}
	
	public void setNumber(int new_number) {
		if (new_number > 0) {
			this.number = new_number;
		}
		
		else {
			System.out.println("Number should be a positive number");
			System.exit(0);
		}
	}
	
	//Getters
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public double calculate() {
		return (this.price * this.number);
	}
	
	@Override
	public String toString() {
		return "Item: " + this.name + " Price: " + this.price + " Count: " + this.number + " Total: " + this.calculate();
	}
}

class Store {
	private Scanner sc;
	private ArrayList<String> list;
	private double currentTotal;
	
	public Store(Scanner scanner) {
		this.sc = scanner;
		this.list = new ArrayList<String>();
		this.currentTotal = 0.0;
	}
	
	public void makePurchase() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the name of the product: ");
		String itemName = this.sc.next();
		System.out.printf("Enter the price of the product: ");
		double itemPrice = this.sc.nextDouble();
		System.out.printf("Enter the quantity: ");
		int itemQuantity = this.sc.nextInt();
		
		Item item = new Item(itemName, itemPrice, itemQuantity);
		this.currentTotal = this.currentTotal + item.calculate();
		this.writeOutput(item);
	}
	
	public void writeOutput(Item item) {
		try {
			PrintWriter outStream = new PrintWriter(new FileOutputStream("question1.txt", true));
			outStream.println(item);
			outStream.close();
			
			System.out.println(item);
			System.out.println("Current total: " + this.currentTotal + "\n");
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
			System.exit(0);
		}
	}
	
	public void writeTotal() {
		try {
			PrintWriter output = new PrintWriter(new FileOutputStream("question1.txt", true));
			output.println("Total: " + this.currentTotal + "\n");
			output.close();
			this.sc.close();
		}
		catch (FileNotFoundException e) {
			System.exit(0);
		}
	}
}

class Question1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Store store = new Store(scanner);
		
		while (true) {
			System.out.println("Press 1 to make a purchase or Press 2 to exit:");
			String input = scanner.next();
			if (input.equals("1")) {
				store.makePurchase();
			}
			else if (input.equals("2")) {
				store.writeTotal();
				scanner.close();
				break;
			}
		}
	}
}