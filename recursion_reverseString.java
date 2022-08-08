public class recursion_reverseString {
    
    static void reverseString(String sc, int index){
        if(index==0){
            System.out.println(sc.charAt(index));
            return;
        }
        System.out.print(sc.charAt(index));
        reverseString(sc, index-1);
    }
    
    public static void main(String[] args) {
        String sc = "Hello";
        reverseString(sc, sc.length()-1);
    }
}
