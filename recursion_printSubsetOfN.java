import java.util.ArrayList;


//print all the subsets of a set of first n natural numbers
public class recursion_printSubsetOfN {

    static void printSubsets(ArrayList<Integer> ssets){
        for (int i = 0; i < ssets.size(); i++) {
            System.out.print(ssets.get(i));
        }
        System.out.println();
    }

    static void subsets(int n, ArrayList<Integer> ssets){
        if(n==0){
            printSubsets(ssets);
            return;
        }
        //add
        ssets.add(n);
        subsets(n-1, ssets);
        //not add
        ssets.remove(ssets.size()-1);
        subsets(n-1, ssets);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> ssets = new ArrayList<>();
        subsets(n, ssets);
    }
}
