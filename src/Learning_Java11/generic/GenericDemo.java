package Learning_Java11.generic;

public class GenericDemo<T> {
    T val;

    public GenericDemo(T val){
        this.val = val;
    }

    public  Object getValue(String name){
        return this.val;
    }

    public static void main(String[] args) {
        GenericDemo<String> g = new GenericDemo<String> ("Good short"); // yha ye generic bna hai bcoz ab hm "g" se only String value hi access kr skte hai.
        // yha Integer -> T m convert hoga.
        System.out.println(g.getValue(g.val.getClass().getName()));

        GenericDemo<Integer> g2 = new GenericDemo(123); // Now ye int value lega
       // System.out.println(g2.getValue());
        System.out.println(g2.getValue((g.val.getClass().getName())));

        GenericDemo<Boolean> g3 = new GenericDemo<>(true);
        //System.out.println(g3.getValue());





    }

}
