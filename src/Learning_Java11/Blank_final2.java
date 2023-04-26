package Learning_Java11;

public class Blank_final2 {
    public final String name;
    public final int age;

    Blank_final2()  //Blank final ek chance deta hi eski value ek baar change kr skte hai [constructor bnakr]
    {
        this.name = "Himanshu";
        this.age = 19;
    }
    public void display(){
//        String name = "hbfkb";
        System.out.println("Name of Student is :"+name);
        System.out.println("Age of Student is :"+age);
    }

    public static void main(String[] args) {
        //Blank_final2 b = new Blank_final2()
        new Blank_final2().display();
    }
}
