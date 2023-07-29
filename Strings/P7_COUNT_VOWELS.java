import java.util.Scanner;

public class P7_COUNT_VOWELS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        int count = 0;
        for (int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
                count++;
            }
        }
        System.out.println(count);
    }
}
