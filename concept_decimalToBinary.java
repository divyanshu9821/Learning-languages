import java.util.Scanner;

public class concept_decimalToBinary{

	static void decimalToBinary(int num) {
		int result[] = new int[32];
		int i = 0;
		while (num > 0) {
		    result[i] = num % 2;
		    num /= 2;
		    i++;
		}
		System.out.print("Binary: ");
		for (int j = i-1; j >= 0; j--) {
		    System.out.print(result[j]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input Number: ");
        int num = sc.nextInt();
        decimalToBinary(num);
		sc.close();
	}
}
