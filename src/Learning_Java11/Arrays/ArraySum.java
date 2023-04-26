package Learning_Java11.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int a=8;
        int ar[] = {1,4,2,5,3,6,2};
        for(int i=1;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==a){
                    System.out.println(ar[i]);
                    System.out.println(ar[j]);
                }
            }
        }
    }
}