import java.util.Scanner;

public class Default {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;

            default:
                System.out.println("wrong operator");
                break;
        }
    }
}
