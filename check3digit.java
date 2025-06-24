import java.util.Scanner;

public class check3digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        if (n<99 && n<1000) 
    {
        System.out.println("it is a 3 digit number ");
    } 
else {
    System.out.println("it is not a 3 digit number ");
} 
}
}
