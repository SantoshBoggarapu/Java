import java.util.Scanner;

public class P4_For_Each_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        for(int i = 0 ; i<str.length();i++){
            System.out.print(str.charAt(i)+",");
        }
    }
}
