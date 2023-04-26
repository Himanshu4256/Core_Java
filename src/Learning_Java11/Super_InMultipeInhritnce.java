package Learning_Java11;

interface Contract_1 {
    double PI = 3.14;
    void add(int a, int b);
//    static void calculation(){
//        System.out.println("Contract_1.defaultMth()");
//    }
    default void defaultMth(){
        System.out.println("Himanshu");
    }
}

interface Contract_2{
    int PI = 0;
    void add(int a, int b);
    default void defaultMth(){
        System.out.println("Contract_2.defaultMth()");
    }
}
interface Contracts extends Contract_1,Contract_2{
    default void defaultMth(){
        Contract_2.super.defaultMth();

    }
}
class ContractImpl implements Contract_1,Contract_2{
    public void add(int a,int b){

    }
    public void defaultMth(){
        Contract_1.super.defaultMth();
        System.out.println("Contract1.defaultMth()");
    }
}

class Super_InMultipeInhritnce {
    public static void main(String[] args) {
        ContractImpl c = new ContractImpl();
        c.defaultMth();
       // System.out.println(super.defaultMth());    -- error []

    }
}