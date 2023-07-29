import java.util.Arrays;
import java.util.Scanner;

public class P11_Sorting_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = 0 ; i< ch.length;i++){
            System.out.print(ch[i]);
        }

    }
}
