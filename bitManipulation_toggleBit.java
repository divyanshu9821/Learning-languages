import java.util.Scanner;

public class bitManipulation_toggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;
        int notBitMask = ~bitMask;
        if((num&bitMask)==0)
            //setBit
            System.out.println(num|bitMask);
        else
            //clearBit
            System.out.println(num&notBitMask);
        sc.close();
    }
}
