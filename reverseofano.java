import java.util.Scanner;

public class reverseofano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();
        int rev  =0;
        while(n!=0){
            int ld = n%10;
            rev *= 10;
            rev += ld;
            n=n/10;
        }
        System.out.println(n+rev);
        }


    }

