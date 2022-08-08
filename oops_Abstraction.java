abstract class AbstractEmployee
{
    abstract void promotion();
}

class person extends AbstractEmployee
{
	private
    String Name;
    String Company;
    int Age;

    void setName(String name)//setter method
    {
        Name = name;
    }
    String getName()//getter method
    {
        return Name;
    }

    void setCompany(String company)//setter method
    {
        Company = company;
    }
    String getCompany()//getter method
    {
        return Company;
    }

    void setAge(int age)//setter method
    {
        Age = age;
    }
    int getAge()//getter method
    {
        return Age;
    }

    void promotion()
    {
        if (Age > 30)
            System.out.println(Name+" get promotion");
        else
        	System.out.println(Name+" not get promotion");
    }
}
public class oops_Abstraction {

	public static void main(String[] args) {
		
		person emp1 = new person();
	    emp1.setName("Divyanshu");
	    emp1.setCompany("Apple");
	    emp1.setAge(30);
	    System.out.println(emp1.getName()+" "+emp1.getCompany()+" "+emp1.getAge()+" ");
	    emp1.promotion();
	}

}
