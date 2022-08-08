import java.util.Scanner;

public class string_replaceCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='e')
                result+='i';
            else
                result += input.charAt(i);    
        }
        System.out.println(result);
        sc.close();

        //////////////////////////string builder class//////////////////////////
        // Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // StringBuilder str = new StringBuilder(input);
        // for (int i = 0; i < input.length(); i++) {
        //     if(str.charAt(i)=='e')
        //         str.setCharAt(i, 'i');
        // }
        // System.out.println(str);
        // sc.close();
    }
}
