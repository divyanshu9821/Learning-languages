import java.util.*;

public class pattern_advance {
    // first pattern
    static void pattern1(int n) {

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // second pattern
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // third pattern
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // forth pattern
    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--)
                System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // fifth pattern
    // pascal pyramid
    static void pattern5(int n) {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
 
            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {
 
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    // sixth pattern
    static void pattern6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    // seventh pattern
    static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 0; j--)
                System.out.print(i + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter '0' to exit.\nEnter pattern no.: ");
            num = sc.nextInt();
            switch (num) {

                case 7:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern7(i);
                    break;

                case 6:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern6(i);
                    break;

                case 5:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern5(i);
                    break;

                case 4:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern4(i);
                    break;

                case 3:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern3(i);
                    break;

                case 2:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern2(i);
                    break;

                case 1:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern1(i);
                    break;
                case 0:
                    num = 0;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            if (num == 0)
                break;
        }
        sc.close();
    }
}
