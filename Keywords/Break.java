public class Break {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<n;j++){
                if(i==2 && j==2){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}
