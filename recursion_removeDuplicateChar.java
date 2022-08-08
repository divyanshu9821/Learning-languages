public class recursion_removeDuplicateChar {
    static String str = "", newStr = "";
    static boolean map[] = new boolean[26];

    static void removeDuplicate(int index) {
        char curr = str.charAt(index);
        if(index==str.length()-1){
            System.out.println(newStr);
            return;
        }
        if (map[curr - 'a']) {
            removeDuplicate(index + 1);
        } else {
            newStr+=curr;
            map[curr-'a']=true;
            removeDuplicate(index+1);
        }
    }

    public static void main(String[] args) {
        str="abbcccccddaa";
        removeDuplicate(0);
    }
}
