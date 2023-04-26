package Learning_Java11;

public class ToString {
    int a = 8;
    void name(){
        System.out.println("Himanshu Sharma");
    }

    @Override
    public String toString() {
        return "Hi This is toString() Mth [reference variable directly ese hi call krta hai]";
    }

    public static void main(String[] args) {
        ToString t = new ToString();
        //t.name();
        System.out.println(t); // agr upr tostring nah bnaoge to ye reference[hascode] hi print krega.
    }
}
