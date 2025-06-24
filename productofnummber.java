import java.util.Scanner;

public class productofnummber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter the number ");
    int n = sc.nextInt();
    int mul = 1;
    while (n!=0){
        int ld = n%10;
        mul  *= ld;
    }
    System.out.println(mul);
}
}