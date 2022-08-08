import java.util.Scanner;

public class concept_binaryToDecimal {

    static int binaryToDecimal(int num) {
        int result = 0;
        int i = 1;
        while (num > 0) {
            int bit = num % 10;
            result += bit * i;
            i *= 2;
            num /= 10;
        }
        return result;
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Binary: ");
        int num = sc.nextInt();
        System.out.println("Decimal: " + binaryToDecimal(num));
        
        sc.close();
    }
}
