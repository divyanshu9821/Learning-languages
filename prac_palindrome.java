
public class prac_palindrome {
	public static void main(String[] args) {
		String str = "radar";
		int strLen = str.length();
		if(isPalindrome(str,strLen))
			System.out.println(str + " is panlindrome");
		else
			System.out.println(str + " is not palindrome");
		
	}
	public static boolean isPalindrome(String str, int length) {
		for(int i = 0;i<length;i++) {
			if(str.charAt(i) == str.charAt(length-i-1))
				continue;
			else
				return false;
		}
		return true;
	}
}
