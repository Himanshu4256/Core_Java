package package_program.stringwork;

class Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Himanshu");
        System.out.println(sb.append("Sharma")); // this is mutable
        System.out.println(sb.capacity()); // default is 16. But now [16+String length]=24

        StringBuffer s = new StringBuffer(1000); // ya capacity khud define kr di
        System.out.println(s.capacity());
    }


}
