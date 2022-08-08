public class recursion_arrangeInLine{

    static void arrange(String str,String perm){

        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            arrange(newStr, perm+curr);
        }
    }

    public static void main(String[] args) {
        arrange("ABC", "");
    }
}