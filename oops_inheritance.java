class Employee
{
    //default access modifier which is 'private' in c++
    String Name;
    String Company;
    int Age;

    public void setName(String name)
    {
        Name = name;
    }
    String getName()
    {
        return Name;
    }

    void setCompany(String company)
    {
        Company = company;
    }
    String getCompany()
    {
        return Company;
    }

    void setAge(int age)
    {
        Age = age;
    }
    int getAge()
    {
        return Age;
    }

    Employee(String name, String company, int age)
    {
        Name = name;
        Company = company;
        Age = age;
    }
    void display()
    {
    	System.out.println(Name+" "+Company+" "+Age);
    }

}

class Developer extends Employee
{
    String FavLang;

    public Developer(String name, String company, int age, String favLang)
    {
		super(name, company, age);
        FavLang = favLang;
	}
    void devDisplay()
    {
    	System.out.println(getName()+" loves to code in "+ FavLang);
    }
}

public class oops_inheritance {
		public static void main(String[] args) {
			
	    Employee emp1 = new Employee("Divyanshu", "Apple", 30);
	    emp1.display();

	    Developer emp2 = new Developer("Anshu", "Airtel", 23, "C++");
	    emp2.devDisplay();
	}
}
