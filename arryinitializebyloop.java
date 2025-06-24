import java.util.Scanner;

public class arryinitializebyloop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={1,2,3,4,5,6,7};
        // System.out.print("enter number of elements: ");
        // int n = sc.nextInt();
        // for(int i = 1; i<=8; i++){
        //    System.out.println(i+"");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
            sc.close();
        }
        // System.out.println(arr);
        }
} 
