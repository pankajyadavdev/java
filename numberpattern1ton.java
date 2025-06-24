import java.util.Scanner;

public class numberpattern1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
     for(int line = 1; line<=n; line++){
        for(int i = 1; i<=n; i++){
            System.out.print((char)(i+64)+" ");//changing the valur i to j then we get same alphbet output like  aaaaaaa
            //bbbbbbb
      }
         System.out.println();
                }                
        }
    }