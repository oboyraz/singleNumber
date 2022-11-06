public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        //int[] arr = {2,2,1};
        for (int i = 0; i < arr.length; i++) {
            int control = 0;
            for (int j = 0; j < arr.length; j++) {
               if (arr[i]==arr[j]){
                   control++;
               }
            }
            if (control==1){
                System.out.println(arr[i]);
            }
        }
    }
}