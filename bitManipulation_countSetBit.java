
import java.util.Scanner;

public class bitManipulation_countSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num>0){
            num&=(num-1);
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}
