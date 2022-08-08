
import java.util.Scanner;
public class prac_checkPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//5
		boolean isPrime = false;
		if(num == 1)
			isPrime = false;
		else{
			for(int i = 2; i<=num/2; i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
				else
					isPrime = true;
			}
			
		}	
		
		if(isPrime)
			System.out.println(num + " is Prime.");
		else
		System.out.println(num + " is not prime.");
		sc.close();
	}
}
