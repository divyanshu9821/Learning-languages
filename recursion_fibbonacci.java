// import java.util.Scanner;

// using recursion
public class recursion_fibbonacci {

//__________________this will print the series till nth__________________//

   // static void fibbo(int a, int b, int n)
    // {
    //     if(n==0)
    //         return;
    //     int c = a+b;
    //     System.out.println(c);
    //     fibbo(b,c,n-1);
    // }

    // public static void main(String[] args) {
    //     int a = 0;
    //     int b = 1;
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println(a);
    //     System.out.println(b);
    //     fibbo(a, b, n-2);
    //     sc.close();
    // }

//__________________this will print the number at nth__________________//

    public static void main(String[] args){
        recursion_fibbonacci rec = new recursion_fibbonacci();
        int result = rec.fibbo(6);
        System.out.println(result);
    }

    public int fibbo(int n){
        // System.out.println(n);
        if(n<0)
            return -1;
        if(n==0||n==1)
            return n;    
        return fibbo(n-1)+fibbo(n-2);
    }
}
