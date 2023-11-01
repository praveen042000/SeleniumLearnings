import java.util.Scanner;

public class MaxProductPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double maxPrice = -1;

		while (true) {
			System.out.print("Enter the price of a product (-1 to quit): ");

			if (sc.hasNextDouble()) {
				double price = sc.nextDouble();

				if (price == -1) {
					break;
				} else if (price < 0 || price > 100) {
					System.out.println("Invalid price. Price should be between 0 and 100.");
				} else if (price > maxPrice) {
					maxPrice = price;
				}
			} else {
				System.out.println("Invalid input. Please enter a valid price.");
				sc.next(); 
			}
		}

		if (maxPrice != -1) {
			System.out.println("The maximum price is: " + maxPrice);
		} else {
			System.out.println("No valid prices entered.");
		}

	}
}
