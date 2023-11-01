import java.util.*;
public class KPattern {
	public static void main(String[] args) {
		int n ;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number = ");
		n=sc.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}




	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number to check amicable or not");

		int num1 = sc.nextInt();

		System.out.println("Enter the Second number to check amicable or not");

		int num2 = sc.nextInt();

		int sum1=0;

		int sum2=0;

		for (int i = 1; i<num1; i++) {

			if(num1%i==0) {

				sum1+=i;

			}

		}

		for (int j = 1; j<num2; j++) {

			if(num2%j==0) {

				sum2+=j;

			}		

	}

		if(sum1==num2&&sum2==num1) {

			System.out.println("True");

		}else {

			System.out.println("False");

		}

	}