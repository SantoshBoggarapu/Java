import java.util.Locale;
import java.util.Scanner;

public class P13_Check_String_Is_Lower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equals(str.toUpperCase())){
            System.out.println("yes!all are upper");
        }
        else {
            System.out.println("no.");
        }

    }
}
