package Learning_Java11.Arrays;

public class Min_Max{
    public static void main(String args[]){
        int[] A = {3,2,1,56,1000,167};

        int max = A[0];
        int min = A[0];
        for(int i = 1;i<A.length;i++){
            if(A[i]>max && A[i]<min && A[i]%2 == 0)
            {
                max = A[i];

            }
            if(A[i]<min)
            {
                min = A[i];
            }
            if(A[i]%2 == 0){
                System.out.println("even is :"+A[i]);
            }
        }
        System.out.println("Your max number is :"+max);
        System.out.println("The Minimum Number is :"+min);
    }
}