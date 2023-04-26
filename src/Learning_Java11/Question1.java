package Learning_Java11;

class ABC {
    int count = 0;
}
public class Question1 {
    public static void main(String[] args) {
        ABC object = new ABC();
        object.count= 100;
        System.out.println(object.count);
        update(object);
        System.out.println(object.count);
    }
    static void update(ABC t){
        t.count = 200;
        System.out.println(t.count);
    }
}
