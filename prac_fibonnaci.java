
import java.util.Scanner;
public class prac_fibonnaci {
	public static void main(String[] args) {
		int terms;
		Scanner sc = new Scanner(System.in);
		terms = sc.nextInt();
		int firstTerm = 1;
		int secondTerm = 1;
		for(int i = 0;i<terms;i++) {
			System.out.print(secondTerm+ " ");
			secondTerm += firstTerm;
			int temp = secondTerm;
			secondTerm = firstTerm;
			firstTerm = temp;
		}
		sc.close();
	}
}