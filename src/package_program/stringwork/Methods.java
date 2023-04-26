package package_program.stringwork;

import com.sun.tools.corba.se.idl.StringGen;

import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String Name = "Himanshu";
        String s = new String("Himanshu");
        System.out.println(Name);
        System.out.println(s);

        System.out.println(Name.equals(s)); // Check Values
        System.out.println(Name==s); // check reference

        System.out.println("Sharma".equals("Sharma"));


        int a = Name.indexOf("an");
        System.out.println("Index of"+a);

        String sub = Name.substring(2,4);
        System.out.println(sub); // 2 se 4-1 tak

        String s2 = Name.substring(2); // 2 se end tak


        char c[] = {'H','S'};
        System.out.println(c);

        String c2 = "Hs";
        System.out.println(c2);

        String n = new String("Himanshu");
        System.out.println(n);

        String inte = new String(Name);
        System.out.println(inte);

        System.out.println(Name.toUpperCase());
        System.out.println(Name.toLowerCase());
        System.out.println(Name.replace("Himanshu","Himanshi"));
        System.out.println(Name.indexOf("s"));
        System.out.println(Name.lastIndexOf("s")); // Last se index Position dekhta hai
        System.out.println(Name.charAt(4));
        System.out.println(Name.contains("a"));

        String h = "Himanshu...:Sharma...";

        String[] arr = h.split(":");
        for(String str:arr){
            System.out.println(str);
        }

        for(int i = 0; i<arr.length;i++){
            System.out.println("--------"+arr[i]);
        }

    }
}
