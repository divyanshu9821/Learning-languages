import java.util.*;
public class concept_gcd{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		while(num1!=num2){
			if(num1>num2)
				num1= num1-num2;
			else if(num2>num1)
				num2=num2-num1;	
		}
		System.out.println("HCF or GCD: "+num2);
		sc.close();
	}
}