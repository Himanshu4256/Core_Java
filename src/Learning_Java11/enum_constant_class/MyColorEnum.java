package Learning_Java11.enum_constant_class;

public enum MyColorEnum {
    RED("RED"),
    GREEN("green"),
    BLUE("blue");

    String str;
    MyColorEnum() {}

    MyColorEnum(String str){
        this.str = str;
    }
    public String getDetails(){
        return "Welcome-"+str;
    }
}
