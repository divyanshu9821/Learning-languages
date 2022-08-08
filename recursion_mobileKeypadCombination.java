
public class recursion_mobileKeypadCombination {

    static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static void printCombination(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char curr = str.charAt(index);
        String mapping = keypad[curr - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, index+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        printCombination("234", 0, "");
    }
}