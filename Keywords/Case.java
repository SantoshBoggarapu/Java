import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch){
            case 'a':
                System.out.println("Alphabet is a");
                break;
            case 'b':
                System.out.println("Alphabet is b");
                break;
            default:
                System.out.println("Incorrect");
                break;

        }
    }
}
