import java.util.Scanner;

public class P5_Iterate_Through_String_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        for (int i = 0 ; i< str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
