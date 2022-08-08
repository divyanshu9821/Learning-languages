import java.util.Scanner;
class dynamicProgramming_fibbonacci{
    
    static long [] arr = new long [100];

    long fib(int n){
        if(n<3)
            return 1;

        if(arr[n]>0){
            return arr[n];
        }    

        arr[n] = fib(n-1)+fib(n-2);
        return arr[n];
    }

    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        simple obj = new simple();
        System.out.println(obj.fib(num));
    
    }
}