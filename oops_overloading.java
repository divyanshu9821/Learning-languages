class Adde{
	static int add(int a,int b){return a+b;}  
	static int add(int a,int b,int c){return a+b+c;} 
	
}

public class oops_overloading {

	public static void main(String[] args) {
		
		System.out.println(Adde.add(11,11));  
		System.out.println(Adde.add(11,11,11));
	}	

}
