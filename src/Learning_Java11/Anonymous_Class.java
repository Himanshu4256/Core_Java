package Learning_Java11;

class Greeting {
    public void sayHello(){
        System.out.println("Hi Coders");
    }
}
class India{


    Greeting g = new Greeting()    // ye internal Greeting class ka nahi hai ye Anonymous class ka obj hai jo invisible hai. Yaha Anonymous class create hui hai
    {                              // ye always sub class ki bnti hai.
        public void sayHello(){
            System.out.println("Namaste");
        }
    };
}

public class Anonymous_Class
{
    public static void main(String[] args) {

    }
}
