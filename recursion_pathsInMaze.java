import java.util.Scanner;

public class recursion_pathsInMaze {

    long[] hash;

    long gridTraveler(int m, int n){
        
        if(m==1&&n==1)
            return 1;
        
        if(m==0||n==0)
            return 0;

        if(hash[m*100+n]>0)
            return hash[m*100+n];    
        
        long right = gridTraveler(m,n-1);//column decreases
        
        long down = gridTraveler(m-1,n);//row decreases
        
        hash[m*100+n] = right + down;
        
        return right + down;
    }

    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        
        recursion_pathsInMaze newObj = new recursion_pathsInMaze();
        
        int row = sc.nextInt();
        
        int col = sc.nextInt();

        int[] hash = new long[1819];
        
        long totalPaths = newObj.gridTraveler(row,col);
        
        System.out.println(totalPaths);
    }

}