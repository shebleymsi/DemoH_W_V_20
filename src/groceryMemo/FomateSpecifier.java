package groceryMemo;

import java.util.Scanner;


public class FomateSpecifier {

	public static void main(String[] args) {
		
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter Price : ");
		double price = input.nextDouble();
		System.out.println("Price is " + price);

		System.out.print("Enter Quantity : ");
		double Quantity = input.nextDouble();
		System.out.println("Quantity is " + Quantity);

		double total = price * Quantity;
		System.out.printf("Total is : %.2f\n", total);
		input.close();

	}

}
