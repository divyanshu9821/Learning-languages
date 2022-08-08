
//using recursion
public class recursion_sumOfNnumber{

    static void printSum(int i, int num, int sum){
        if(i==num){
            sum+=num;
            System.out.println(sum);
            return;
        }
        printSum(i+1,num,sum+i);
    }
    
    public static void main(String[] args) {
        printSum(1,6,0);
    }
}
