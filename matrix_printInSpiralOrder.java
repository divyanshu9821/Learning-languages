import java.util.Scanner;

public class matrix_printInSpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int row = sc.nextInt();
        System.out.print("Columns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];

        System.out.println("***Start entering elements***");
        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        int rowStart = 0;
        int rowEnd = row - 1;
        int colStart = 0;
        int colEnd = col - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int i = colStart;i<=colEnd;i++)
                System.out.print(arr[rowStart][i]+" ");
            rowStart++;
                
            for(int i = rowStart;i<=rowEnd;i++)
                System.out.print(arr[i][colEnd]+" ");
            colEnd--;
            
            for(int i = colEnd;i>=colStart;i--)
                System.out.print(arr[rowEnd][i]+" ");
            rowEnd--;

            for(int i = rowEnd;i>=rowStart;i--)
                System.out.print(arr[i][colStart]+" ");
            colStart++;
        }

        sc.close();
    }
}
