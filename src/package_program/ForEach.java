package package_program;

public class ForEach {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};

        //for each loop
        for(int b : a)
        // a = Array variable   // b = for each variable    // a ka content b mai store kiya hai.
        {
            System.out.println(b);
        }

        // Normal for loop
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
