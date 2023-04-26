package Learning_Java11.enum_constant_class;

public class Runner {
    public static void main(String[] args) {
        MyColor color = MyColor.RED;
        System.out.println(color.getDetails());
        color = MyColor.BLUE;
        System.out.println(color.getDetails());
        color = MyColor.GREEN;
        System.out.println(color.getDetails());

        System.out.println("-----------------------------");
        MyColorEnum colorEnum = MyColorEnum.BLUE;
        System.out.println(colorEnum.getDetails());

        colorEnum = MyColorEnum.RED;
        System.out.println(colorEnum.getDetails());

        colorEnum = MyColorEnum.GREEN;
        System.out.println(colorEnum.ordinal()); // Defines the position like index
        System.out.println(colorEnum.valueOf("BLUE"));

        MyColorEnum[] values = MyColorEnum.values();
        for(MyColorEnum myColorEnum : values){
            System.out.println(myColorEnum.getDetails());
        }
    }
}
