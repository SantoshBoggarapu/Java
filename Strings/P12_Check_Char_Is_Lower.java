import java.util.Scanner;

public class P12_Check_Char_Is_Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)){
            System.out.println("Upper Case");
        }
        else {
            System.out.println("Lower Case");
        }
    }
}
