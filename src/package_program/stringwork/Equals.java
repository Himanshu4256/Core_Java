package package_program.stringwork;

public class Equals {
    public static void main(String[] args) {
        String s1 = new String("Himanshu");
        String s2 = new String("Himanshu");
        System.out.println(s1==s2); // false bcoz heap m reference check kiya hai.
        System.out.println(s1.equals(s2)); // check the values

        String s3 = "Himanshu";
        String s4 = "Himanshu";
        System.out.println(s4==s3); // true bcoz check the value in SCP.
        //System.out.println(s3.equals(s4));


        byte[] a = {100,101,102};
        String s = new String(a);
        System.out.println(s); //100-d, 101-e, 102-f

        int[] w = {100,101,102};
        String x = new String(a);
        System.out.println(x); //100-d, 101-e, 102-f
    }
}
