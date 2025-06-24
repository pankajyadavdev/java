public class secondmaxinarrray {
    public static void main(String[] args) {
        int arr[] = {100,2,3,4,20,6,7};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max)max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]<max){
                smax = arr[i];
            }
        }
        System.out.println("max element in the array is: "+max);
        System.out.println("second max element in the array is: "+smax);
    }
    }

