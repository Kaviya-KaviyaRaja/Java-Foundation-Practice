package src;
import java.util.Scanner;
public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a num2: ");
		int num2 = sc.nextInt();
		
		int sum =  num1 + num2;
		int diff = num1 - num2;
		int product = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println("The Sum of two number is : "+ sum);
		System.out.println("The Difference of two num is : "+ diff);
		System.out.println("The Product of two number is : "+ product);
		System.out.println("The Division of two number is : "+ div);
		System.out.println("The Modulus  of two number is : "+ mod);
		}

}
