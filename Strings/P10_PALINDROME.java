import java.util.Scanner;

public class P10_PALINDROME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        String newstr = "";
        for(int i = str.length()-1;i>=0;i--){
            newstr = newstr+str.charAt(i);
        }
        System.out.println(newstr);
        if (str.equals(newstr)){
            System.out.println("Yes!It is Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
