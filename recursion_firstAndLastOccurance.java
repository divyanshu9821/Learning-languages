public class recursion_firstAndLastOccurance {

    public static int first = -1;
    public static int last = -1;

    static void findOccurance(char element, int index, String str ){
        if(index==str.length()){
            System.out.println(first+"\n"+last);
            return;
        }

        if(str.charAt(index)==element){
            if(first==-1)
                first=index;
            else
                last=index;    
        }

        findOccurance(element, index+1, str);
    }
    public static void main(String[] args) {
        String sc = "abaacdaefaah";
        char ch = 'a';
        findOccurance(ch, 0, sc);
    }
}
