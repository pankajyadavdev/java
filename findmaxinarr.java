public class findmaxinarr {
    public static void main(String[] args) {
        int arr[] = {100,2,3,4,20,6,7};
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max element in the array is: "+max);
    }
}
