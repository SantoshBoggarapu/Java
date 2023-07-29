import java.util.Scanner;

public class P14_SWAPPING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(swap(str,0,str.length()-1));

    }
    static char[] swap(String str , int i , int j){
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
}
