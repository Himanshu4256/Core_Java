package Learning_Java11;

public class Blank_Final {
    final int a; // wase to final var m vlue pass krni jaruri Hoti hai.
                 // But Using Blank final hamko ek change milta hai ki ham eski value constructor mai pass kr skte hai.
                 Blank_Final(int a){
                     this.a = a;
                     System.out.println("The Value of 'a' is :"+a);
                 }


//      Blank_Final(){
//         this.a = 10;
//         System.out.println("The Value of 'a' is :"+a);
//     }

    public static void main(String[] args) {
        Blank_Final b = new Blank_Final(10);
    }

}
