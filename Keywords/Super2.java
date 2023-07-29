class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class tiger extends Animal{
    void bark(){
        System.out.println("barking");
        super.eat();

    }



}


public class Super2 {
    public static void main(String[] args) {
        tiger t1 = new tiger();
        t1.bark();

    }
}
