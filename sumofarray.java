import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int n = sc.nextInt();
        System.out.print("enter the array elements");
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
    } 
    int sum =0;
     for(int i = 0; i<n; i++)
     sum += arr[i];
     System.out.println("sum of array elements is: "+sum);
}
}
