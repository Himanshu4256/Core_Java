package Learning_Java11.generic;

public class NormalDemo {
    Object container;

    public NormalDemo(Object container){
        this.container = container;
    }
    public Object getValue(){
        return this.container;
    }

    public static void main(String[] args) {

        NormalDemo n = new NormalDemo("This is String [esme kisi bhi type ko rakh skte hai bcoz Object hai]");
        //n.container = 123; // ab yha "int" rkh Diya hai.
        System.out.println(n.getValue()); // uske ander ki value ko return krega
        System.out.println(n);
    }
}
