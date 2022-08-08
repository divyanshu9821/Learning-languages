import java.util.Scanner;
public class switch_miniCalc {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operator;
		
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		sc.close();
		switch (operator)
		{
			case '+':System.out.println(num1+num2);
			break;
			
			case '-':System.out.println(num1-num2);
			break;
			
			case '*':System.out.println(num1*num2);
			break;
			
			case '/':if(num2==0)
						System.out.println("Invalid Division");
					 else
						System.out.println(num1/num2);
			break;
			
			case '%':if(num2==0)
						System.out.println("Invalid Division");
			 		 else
			 			 System.out.println(num1%num2);
			break;
			
			default:System.out.println("Invalid operator");
		}
	}

}
