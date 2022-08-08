import java.util.Scanner;

public class string_printCommulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        String arr[] = new String[arrSize];
        int totalLenght = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.next();
            totalLenght += arr[i].length();
        }
        System.out.println(totalLenght);
        sc.close();

        ///////////////////////// Another approch //////////////////////////
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int totalLenght = 0;
        // while(size>0){
        //     String str = sc.next();
        //     totalLenght+=str.length();
        //     size--;
        // }
        // System.out.println(totalLenght);
        // sc.close();
    }
}
