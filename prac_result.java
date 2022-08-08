
public class prac_result {
	public static void main(String[] args) {
		int oops = 56;
		int wt = 67;
		int cao = 87;
		int os = 54;
		int dm = 33;
		int ob = 89;
		int evs = 97;
		int percentMarks = (oops+wt+cao+os+dm+ob+evs)/7;
		if(oops<35&&wt<35&&cao<35&&os<35&&dm<35&&ob<35&&evs<35)
			System.out.println("You are Failed");
		else {
			System.out.println("You are passed!");
			if(percentMarks>65)
				System.out.println("You got A grage.");
			else if(percentMarks>=45&&percentMarks<=65)
				System.out.println("You got B grage.");
			else if(percentMarks>=35&&percentMarks<=45)
				System.out.println("You got c grage.");
			else if(percentMarks<35)
				System.out.println("You are failed");
			else
				System.out.println("Check your input again");
		}
	}
}
