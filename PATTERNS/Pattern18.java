import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i<num;i++){
            for(int j = i ; j>0 ; j--){
                char ch = (char) ('A' + (num-1)-j);
                System.out.print(ch);


            }
            System.out.println();
        }
    }
}
