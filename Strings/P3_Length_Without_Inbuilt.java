import java.util.Scanner;

public class P3_Length_Without_Inbuilt
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        int count = 0;
        char[] ch = str.toCharArray();
        for(char c: ch){
            count++;

        }
        System.out.println(count);
    }
}
