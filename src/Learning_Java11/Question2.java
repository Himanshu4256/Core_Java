package Learning_Java11;

public class Question2 {
    public static void main(String[] args) {
        int count = 0;
        count = 100;
        System.out.println(count);
        update(count);
        System.out.println(count);
    }
    static void update (int c){
        c=200;
        System.out.println(c);
    }
}
