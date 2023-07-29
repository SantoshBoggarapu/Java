import java.io.IOException;

public class Throws {
    public static void main(String[] args) {
        Throws t1 = new Throws();
        t1.p();
        
    }
    void m() throws IOException{
        throw new IOException("device error");
    }
    void p(){
        try{
            m();
        } catch (IOException e) {
            System.out.println("exception handeled");
        }

    }
}
