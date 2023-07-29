class Constructor1{
    Constructor1(){
        System.out.println("constructor1 is created");
    }
}

class Constructor2 extends  Constructor1{
    Constructor2(){
        super();
        System.out.println("constructor2 is created");
    }
}
public class Super3 {
    public static void main(String[] args) {
        Constructor2 cons2 = new Constructor2();


    }
}
