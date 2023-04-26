package Learning_Java11.lambda_expression;

interface Anno{
   public void show();
   public void hide();
}
public class AnonymousClass {
    public static void main(String[] args) {
    Anno a = new Anno() // yha class create hui hai jiska koi name nahi hai tbhi mths ko bhi override kiya hai [ye cls ni hai BUT class hai]
                        // yha class ka declaration & initialization same jgh hota hai
    {
        @Override
        public void show() {
            System.out.println("Welcome");
        }
        @Override
        public void hide() {
            System.out.println("in java");
        }

    };
        a.show();
        a.hide();
    }

}
