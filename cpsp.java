import java.util.Scanner;

public class cpsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int cp = sc.nextInt();
        // int sp = sc.nextInt();
        System.out.println("enter the cost price ");
        int cp  = sc.nextInt();
        System.out.println("enter the selling price");
        int sp = sc.nextInt();
        if (sp>cp){
            System.out.println("shopkeeper loss the money");
        }
        else{
            System.out.println("shopkeeper gain the money");
        }
    }
}
