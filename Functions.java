//import java.util.*;
public class Functions {
	public static void odd(int x) {
//		Scanner input = new Scanner(System.in);
//		x = input.nextInt();
				if(x<0) {
			System.out.println("number is odd");
		}
		else {
			System.out.println("wrong number");
		}
		
	}
	public static void even(int x) {
//		Scanner input = new Scanner(System.in);
//		x = input.nextInt();
				if(x>0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("wrong number");
		}
		
	}
	public static void checkPrime(int n) {
		int i, m=0, flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+ "is not prime number");
			
		}
		else {
			for(i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println(n+"is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+"is prime number");
			}}
			
		}
	
	public static void factorial(int n) {
		long factorial=1;
		for(int i=1; i<=n; ++i) {
			factorial*=i;
			
		}
		System.out.println("Factorial of num"+n+ "is :" + factorial);
	}
	//This is Function

}
