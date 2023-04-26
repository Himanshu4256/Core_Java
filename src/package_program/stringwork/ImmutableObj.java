package package_program.stringwork;

public class ImmutableObj {
    public static void main(String[] args) {
        String s = new String("Java");
        s.concat("Programming");
        System.out.println(s); // can't concat bcoz of immutable

        s = s.concat("Programming");
        System.out.println(s); // concat krega but new object k saat.
    }
}
