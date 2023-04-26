package com.company;

import static java.lang.System.*;
public class This {
    int a = 10;

    void mnc(){
        int a = 100;
        out.println(a);

        This d1 = new This();  //object
        out.println("d1.a :"+d1.a); // ye 10 esliye dega bcoz obj creation time pr wo memory occupie krega joki class mai hai. agr esme niche sout(a) kre tb o/p 100 aaega.
        out.println(a);
        out.println("this.a :"+this.a);

        out.println("d1 :"+d1);
        out.println("this :"+this);
    }
        // static method mai this ka use nahi hota.
    public static void main(String[] args) {
        This d1 = new This(); //object
        d1.mnc();
    }

}
