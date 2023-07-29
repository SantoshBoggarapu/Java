
abstract class animal{
    abstract void eat();
}

class  dog extends animal{
    @Override
    void eat() {
        System.out.println("i can eat");
    }

    void sound(){
        System.out.println("bow bow");
    }
}





class Abstract {
    public static void main(String[] args) {

        dog d = new dog();
        d.eat();
        d.sound();

    }
}
