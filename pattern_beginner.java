import java.util.*;

public class pattern_beginner {
    // first pattern
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // Second pattern
    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
        }
    }

    // third pattern
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // forth pattern
    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // fifth pattern
    static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    // sixth pattern
    static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(j + 1 + " ");
            System.out.print("\n");
        }
    }

    // seventh pattern
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++)
                System.out.print(j + 1 + " ");
            System.out.print("\n");
        }
    }

    // eighth pattern
    // floyd's triangle
    static void pattern8(int n) {
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value++;
            }
            System.out.print("\n");
        }
    }

    // ninth pattern
    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.print("\n");
        }
    }

    // tenth pattern
    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    // eleventh pattern
    static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print(i + 1 + " ");
            System.out.println();
        }
    }

    // twelveth pattern
    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");
            for (int j = 2; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num, i = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter '0' to exit and '1'-'12' to print respective patterns");
            System.out.print("Enter pattern no.: ");
            num = sc.nextInt();
            switch (num) {
                case 12:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern12(i);
                    break;

                case 11:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern11(i);
                    break;

                case 10:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern10(i);
                    break;

                case 9:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern9(i);
                    break;

                case 8:
                    System.out.print("i: ");
                    i = sc.nextInt();
                    pattern8(i);
                    break;

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
