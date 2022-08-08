import java.util.HashSet;

public class recursion_printUniqueSubsequesnce {
    static void uniqueSubseqquence(int index, HashSet<String> set, String str, String newStr) {
        if (index == str.length()) {
            if (set.contains(newStr))
            {
                return;
            }
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currChar = str.charAt(index);
        uniqueSubseqquence(index+1, set, str, newStr + currChar);
        uniqueSubseqquence(index + 1, set, str, newStr);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubseqquence(0, set, str, "");
    }
}
