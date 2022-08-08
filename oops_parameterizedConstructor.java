
public class oops_parameterizedConstructor {
	String name; int age;
	oops_parameterizedConstructor(String Name, int Age ){
		name = Name;
		age = Age;
	}
	void display() {
		System.out.print(name+" "+age);
	}
	public static void main(String[] args) {
		oops_parameterizedConstructor c = new oops_parameterizedConstructor("Divyanshu",20);
		c.display();
	}
}
