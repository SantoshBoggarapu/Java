class A{
    void eat(){
        System.out.println("Eating");
    }
}

class B extends A{
    void walk(){
        System.out.println("i can walk");
    }
}


public class Extends {
    public static void main(String[] args) {
        B check = new B();
        check.walk();
        check.eat();

    }
}
