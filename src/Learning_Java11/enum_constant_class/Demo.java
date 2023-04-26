package Learning_Java11.enum_constant_class;

public enum Demo {
    RED,
    GREEN,
    BLACK;

    public static void main(String[] args) {
        Demo d = Demo.RED;
        System.out.println(d);
        Demo d1 = Demo.GREEN;
        System.out.println(d1);
        Demo d2 = Demo.BLACK;
        System.out.println(d2);
    }

}
