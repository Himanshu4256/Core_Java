package Learning_Java11;

//interface Person {
//    void show();
//}
//class Student implements Person{
//    public void show(){
//        System.out.println("Show");
//    }
//}
//public class Anonymous2 {
//    public static void main(String[] args) {
//        Person p = new Student();
//        p.show();
//    }
//}

// ye hai old external process jisse ham void show method ko print kra skte hai.

// Now we use anonymous class concept.
interface Person {
    void show();
}
//class Student implements Person{
//    public void show(){
//        System.out.println("Show");
//    }
//}
public class Anonymous2 {
    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            public void show() {
                System.out.println("Show");
            }
        };
        p.show();
    }
}