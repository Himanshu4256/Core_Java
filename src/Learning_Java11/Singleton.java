package Learning_Java11;

class SingletonClass{

    static SingletonClass sin;            // reference variable....default value = null;
    public int a;

    static public SingletonClass createObj() {
        if(sin==null) {
            sin = new SingletonClass();
        }
        return sin;
    }

    private SingletonClass() {
        // taki real object ban hi na pae....ie.    ---->   SingletonClass s = new SingletonClass();
    }

}
public class Singleton {
    public static void main(String[] args) {
        SingletonClass single1 = SingletonClass.createObj();
       // single1.a=25;
        SingletonClass single2 = SingletonClass.createObj();
       // System.out.println(single2.a);
        SingletonClass single3 = SingletonClass.createObj();

        //SingletonClass s = new SingletonClass();

        System.out.println(single1);
        System.out.println(single2);
        System.out.println(single3);
    }

}