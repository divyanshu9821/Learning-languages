//strictly increasing
public class recursion_checkForSorted {
    static boolean isSorted(int arr[], int index){
        if(index==arr.length-1)
        return true;
        if(arr[index]>=arr[index+1])
        return false;
        return isSorted(arr, index+1);        

    }

    public static void main(String[] args) {
        int arr[] = {1,2,2};
        System.out.println(isSorted(arr, 0));
    }
}
