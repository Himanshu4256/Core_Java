package package_program;

public class Overloading {
    public void mth(int f){
        System.out.println("mth"+f);
    }
    public void mth(float f){
        System.out.println("float mth"+f);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.mth(10);
        o.mth(10.10f);
        o.mth('d'); // Promote into int
        o.mth(10l); // int to long
    }
}
