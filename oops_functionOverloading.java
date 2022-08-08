//it is one of the concept in polymorphism
//different functions can have same in function overloading
//function is used according to the argument passed

public class oops_functionOverloading {

    static void print(){
        System.out.println("Without argument");
    }

    static void print(int x){
        System.out.println(x+" is passed");
    }
    public static void main(String[] args) {
        print();
        print(5);
    }    
}
