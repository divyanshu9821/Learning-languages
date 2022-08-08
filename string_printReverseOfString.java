
public class string_printReverseOfString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Divyanshu");
        System.out.print("Reverse of "+str+" is ");
        for(int i = 0;i<str.length()/2;i++){
            char temp;
            temp = str.charAt(i);
            str.setCharAt(i, str.charAt(str.length()-i-1));
            str.setCharAt(str.length()-i-1, temp);
        }
        System.out.println(str);
    }
}
