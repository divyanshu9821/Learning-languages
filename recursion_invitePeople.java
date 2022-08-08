//find the number of ways in which you can invite n people to your party, single or in pair
public class recursion_invitePeople {
    
    static int call(int n){
        if(n<=1)return 1;
        int way1 = call(n-1);
        int way2 = (n-1)*call(n-2);
        return way1+way2;
    }

    public static void main(String[] args) {
        System.out.println(call(3));
    }
}
