public class Throw {
    public static void main(String[] args)  {
        int age = 17;
        if(age < 18){
            throw new ArithmeticException("you are not eligble to vote");
        }
        else {
            System.out.println("happily you cna vote");
        }
    }
}
