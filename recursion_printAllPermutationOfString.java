public class recursion_printAllPermutationOfString {
    
    static void printPerm(String str, String permStr){

        if (str.length()==0) {
            System.out.println(permStr);
            return;
        }

        for(int i = 0; i<str.length(); i++){

            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPerm(newStr, permStr+curr);
        }

    }

    public static void main(String[] args) {
        printPerm("abc", "");
    }
}
