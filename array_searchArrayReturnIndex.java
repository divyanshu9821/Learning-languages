import java.util.*;
public class array_searchArrayReturnIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        System.out.println("Enter elements ");        
        for(int i = 0;i<sizeOfArray;i++){
            System.out.print("Index "+i+": ");        
            arr[i] = sc.nextInt();
        }
        System.out.print("Search element :");
        int element = sc.nextInt();
        boolean flag = false;
        for(int i = 0;i<sizeOfArray;i++){
            if(arr[i]==element){
                flag = true;     
                System.out.print(i+" ");
            }    
        }        
        if(flag==false)
            System.out.println("Element not found");

        sc.close();
    }
}
