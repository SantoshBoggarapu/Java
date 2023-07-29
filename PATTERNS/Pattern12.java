import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2*(n-1);
        for(int i = 1 ; i<=n;i++){
            //first
            for(int j = 1 ; j<=i ;j++){
                System.out.print(j);
            }

            //space
            for(int j = 1 ; j<=space;j++){
                System.out.print(" ");
            }

            //last
            for(int j=i;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
            space = space - 2 ;
        }
    }
}
