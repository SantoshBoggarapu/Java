import java.util.Scanner;

public class P6_SUM_OF_NUMBERS_IN_STRING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);
        int sum = 0 ;
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int val = Character.getNumericValue(ch);
                sum = sum+val;
            }
        }
        System.out.println(sum);

    }
}
