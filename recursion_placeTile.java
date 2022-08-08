//no of ways tiles placed
public class recursion_placeTile {
    
    static int place(int m,int n){

        if(m==n){
            return 2;
        }
        else if(m<n){
            return 1;
        }
        int vertical = place(m-n, n);//vertical placements
        int horizontal = place(m-1,n);//horizontal place
        return vertical + horizontal;
    }
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        System.out.println(place(m, n));
    }
}
