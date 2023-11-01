import java.util.Scanner;

public class FareCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total Number of passengers = ");
		int number = sc.nextInt();
		int fare = 0;
		int y = 0;

		while (y < number) {
			System.out.println("Enter passenger Name");
			String name = sc.next(); 
			System.out.println("Enter passenger age");
			int age = sc.nextInt();
			System.out.println("Enter the boarding point");
			String  boardingPoint = sc.next();

			if (age <= 5) {
				fare += 0;
			} else if (boardingPoint.equalsIgnoreCase("Pune")) {
				fare += 295;
			} else if (boardingPoint.equalsIgnoreCase("Lonavala")) {
				fare += 235;
			} else {
				System.out.println("Enter Valid Boarding point");
			}

			y++;
			System.out.println("Passenger Name: " + name + " Passenger age: " + age + " Boarding Point: " + boardingPoint);

		}
		System.out.println("The total fare for " + y + " Passengers: " + fare);
	}
}
