package Learning_Java11;

public class QRunner extends Question {
    public static void main(String[] args) {
        Question q = new Question();
        q.a = 10;
        q.b = 20;

        q.pic(100,200);
        System.out.println(q.a);
        System.out.println(q.b);
        System.out.println();


    }
}
