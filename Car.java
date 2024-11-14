package MoreAboutClasses;
import java.util.Scanner;

public class Car {
	String make;
	String model;
	short year;
	int price;
	
	public Car(String make, String model, short year, int price) //constructor
	{
	this.make = make;
	this.model = model;
	this.year = year;
	this.price = price;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //taking input from user
		System.out.println("Enter the car make: ");
		String make = in.nextLine();
		System.out.println("Enter the car model: ");
		String model = in.nextLine();
		System.out.println("Enter the car year: ");
		short year = in.nextShort();
		System.out.println("Enter the car price: ");
		int price = in.nextInt();
		Car c = new Car(make, model, year, price);
		
		//display objects of each Car Class.
		System.out.println("The car make is: "+make);
		System.out.println("The car model is: "+model);
		System.out.println("The car year is: "+year);
		System.out.println("The car price is: "+price);

	}

}
