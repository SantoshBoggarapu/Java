import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =  0 ; i< num ; i++){
            //spaces
            for(int j = 0; j<num-i-1;j++){
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 1 ; j<= 2*i+1;j++ ){
                System.out.print(ch);
                if(j<= breakpoint){
                    ch++;
                }
                else {
                    ch--;
                }

            }
            System.out.println();
        }
    }
}
