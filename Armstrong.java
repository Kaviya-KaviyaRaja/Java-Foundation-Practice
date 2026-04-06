package src;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter a number to find its armstrong or not: ");
		int num = sc.nextInt();
		
		int original = num;
		int sum =0;
		while(num != 0) {
		int digit = num % 10;
		sum = sum + (digit * digit * digit);
		num /= 10;
		}
		if(sum == original) {
			System.out.println("It is a Armstrong");
		}
		else {
			System.out.println("It is not an Armstrong");
		}
	}

}
