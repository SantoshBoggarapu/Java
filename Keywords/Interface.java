
interface printable{
    void print();
}

class A1 implements printable{
    public void print(){
        System.out.println("printing");


    }
}




public class Interface{
    public static void main(String[] args) {
        A1 a = new A1();
        a.print();

    }
}

