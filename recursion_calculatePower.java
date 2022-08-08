public class recursion_calculatePower {
    //stack height = n
    static int calcPow1(int x,int n){
        if(n==0)
            return 1;
        if(x==0)
            return 0;

        int xPowNMO = calcPow1(x, n-1);
        int xPowN = xPowNMO*x;
        return xPowN;
    }

    //stack height = logn
    static int calcPow2(int x,int n){
        if(n==0)
            return 1;
        if(x==0)
            return 0;

        if(n%2==0)
            return (calcPow2(x, n/2) * calcPow2(x, n/2));
        else
            return (calcPow2(x, n/2) * calcPow2(x, n/2)*x);    


    }

    public static void main(String[] args) {
        System.out.println(calcPow2(2, 5));
    }
}
