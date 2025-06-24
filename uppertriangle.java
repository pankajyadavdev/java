import java.util.Scanner;

public class uppertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=2*i-1; j++){
           //for(int j = 1; j<=n+1-i; j++){
            // System.out.print("*");
             System.out.print(i);
            //System.out.print(i);
            //System.out.print((char)(i+64));
            //System.out.print((char)(j+64));
         }
        System.out.println();
    
        } 
}   }
