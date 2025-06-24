import java.util.Scanner;

public class rightsidetrianglr {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n = sc.nextInt();
//     for(int i = 1; i<=n; i++){
//         for(int j = 1; j<=n; j++){
//         if((i+j)>n) System.out.print("*"+" ");
//         else System.out.print(" "+" ");   
//         }
//         System.out.println();
//         }
//     }
// }
// 
for(int i = 1; i<=n; i++){
    for(int j = 1; j<=n-i; j++){
     System.out.print(" "+" ");
    }
    for(int j = 1; j<=i; j++ ){
     System.out.print("*"+" ");   //j for typing number//(char)(j+64)for character  
    }
    System.out.println();
    }
}
}

