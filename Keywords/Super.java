
class A2{
    String color = "black";
    void print(){
        System.out.println(color);
    }
}

class B2 extends A2{
    String color = "white";
    void print(){
        System.out.println(super.color);
        System.out.println(color);
    }
}


public class Super {
    public static void main(String[] args) {
        B2 b = new B2();
        b.print();
    }

}
