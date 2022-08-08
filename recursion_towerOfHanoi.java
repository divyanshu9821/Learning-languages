import java.util.*;
public class recursion_towerOfHanoi {

    public static void tOfH(int noOfDisks, String sourceTower, String helperTower, String destinationTower) {
        if(noOfDisks==1){
            System.out.println("transfer Disk "+noOfDisks+" from "+sourceTower+" to "+destinationTower);
            return;
        }
        tOfH(noOfDisks-1, sourceTower, destinationTower, helperTower);
        System.out.println("transfer Disk "+noOfDisks+" from "+sourceTower+" to "+destinationTower);
        tOfH(noOfDisks-1, helperTower, sourceTower, destinationTower);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int noOfDisks = sc.nextInt();
        
        tOfH(noOfDisks, "S", "H", "D");
        sc.close();
    }
}
