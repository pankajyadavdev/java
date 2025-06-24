import java.util.Scanner;

public class largestamongthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number a :");
        int a = sc.nextInt();
        System.out.println("enter the second number b :");
        int b = sc.nextInt();
        System.out.println("enter the third number c :");
        int c = sc.nextInt();
    
    if(a>b && a>c ){
        System.out.println("a is greater than b and c");
    }
    else if (b>a && b>c){
        System.out.println("b is grater a and c");
    }
    else {
        System.out.println("c is greater a and b");
    }
}
}
