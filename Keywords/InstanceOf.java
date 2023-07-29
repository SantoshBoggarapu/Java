
class dog1{
    void bark(){
        System.out.println("barking");

    }

}
public class InstanceOf {
    public static void main(String[] args) {
        dog1 d = new dog1();
        System.out.println(d instanceof dog1);


    }
}
