public class Catch {
    public static void main(String[] args) {
        try {
            int n = 45/1;
            System.out.println(n);

        }
        catch (Exception e){
            System.out.println("it is a null pointer exception");
        }
    }
}
