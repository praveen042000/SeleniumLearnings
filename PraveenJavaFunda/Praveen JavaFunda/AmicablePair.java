import java.util.Scanner;
public class AmicablePair {
	public static boolean areAmicablePairs(int x, int y) {
		if (x <= 0 || y <= 0) {
			return false; 
		}

		int X = sumOfProperDivisors(x);
		int Y = sumOfProperDivisors(y);

		return X == y && Y == x;
	}

	public static int sumOfProperDivisors(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int x = number.nextInt();

		System.out.print("Enter the second number: ");
		int y = number.nextInt();
		boolean result = areAmicablePairs(x, y);

		System.out.println("Result: " + result);

	}
}


  