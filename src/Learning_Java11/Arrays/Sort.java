package Learning_Java11.Arrays;

public class Sort {
    public static void main(String[] args) {
       int arr[] = {56,93,34,71,82,28,69,1};
       int sort = arr[0];
       int temp;
       for(int i = 1; i<arr.length; i++){
           for(int j = i+1; j<sort;j++){
               if(arr[j]<arr[i]){
                   temp = arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                   System.out.println(arr[j]);
               }
           }
       }
    }
}