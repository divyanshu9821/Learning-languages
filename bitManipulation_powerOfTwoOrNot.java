import java.util.Scanner;

public class bitManipulation_powerOfTwoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ((num & (num - 1)) == 0)
            System.out.println(num + " is power of 2");
        else
            System.out.println(num + " is not power of 2");

        sc.close();
    }
}
