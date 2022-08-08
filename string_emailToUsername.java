import java.util.Scanner;

public class string_emailToUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Email ID:");
        String input = sc.next();
        String userName = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '@')
                break;
            else
                userName += input.charAt(i);
        }
        System.out.println("Username:" + userName);

        sc.close();
    }
}
