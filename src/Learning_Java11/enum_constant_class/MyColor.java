package Learning_Java11.enum_constant_class;

public class MyColor {
    private String str;
    private MyColor() {}
    private MyColor(String str){
        this.str = str;
    }
    final static public MyColor RED = new MyColor("red");
    final static public MyColor GREEN = new MyColor("green");
    final static public MyColor BLUE = new MyColor("blue");

    public String getDetails(){
        return "welcome :"+str;
    }
}