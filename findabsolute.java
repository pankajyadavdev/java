import java.util.Scanner;

public class findabsolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer number");
        int n = sc.nextInt();
        if(n<0)
        n = n * (-1);
        System.out.println(n);
        
}         
}
