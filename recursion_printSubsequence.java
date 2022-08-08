public class recursion_printSubsequence {

    static String str;
    static void subsequence(int index, String newStr){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(index);
        subsequence(index+1, newStr+curr);
        subsequence(index+1, newStr);

    }
    
    public static void main(String[] args) {
        str = "abc";
        subsequence(0, "");
    }
}
