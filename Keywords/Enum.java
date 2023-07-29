public class Enum {
    public enum Week {Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}

    public static void main(String[] args) {
        for(Week w : Week.values()){
            System.out.println(w);
        }
        System.out.println();
        System.out.println(Week.valueOf("Monday"));
        System.out.println(Week.valueOf("Tuesday").ordinal());
    }
}
