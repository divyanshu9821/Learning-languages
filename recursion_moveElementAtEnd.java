public class recursion_moveElementAtEnd {
    static char element = 0;
    static String str="", newString="";


    static void moveAtEnd(int index, int count) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString+=element;
            }
            System.out.println(newString);
            return;
        }

        if (str.charAt(index) == element) {
            count++;
            moveAtEnd(index + 1, count);
        } else {
            newString+=str.charAt(index);
            moveAtEnd(index + 1, count);
        }

    }

    public static void main(String[] args) {
        element = 'x';
        str = "axbcxxd";
        moveAtEnd(0, 0);
    }
}
