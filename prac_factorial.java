
import java.util.Scanner;
public class prac_factorial {
	public static void main(String[] args) {
		int num, fac = 1;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		for(int i = 2;i<=num;i++) {
			fac*=i;
		}
		System.out.println("Factorial of "+num+": "+fac);
		sc.close();
		}
	
}
