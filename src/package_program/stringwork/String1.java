package package_program.stringwork;

public class String1 {
    public static void main(String[] args) {
        String name = "Refactor";
        int x = name.indexOf("or"); // Print the first word index
        System.out.println(x);
        int c = name.lastIndexOf("or");
        System.out.println(c);


        //indexOf() = ye index return krta hai.
        //charAt() = ye value return krta hai.


        String sub = name.substring(2,4); // 2 se (4-1 = 3) tak lega
        System.out.println(sub);

        String s2 = name.substring(3); // index 3 se last tak lega
        System.out.println(s2);
    }
}
