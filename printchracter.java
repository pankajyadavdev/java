public class printchracter {
    public static void main(String[] args) {
        int a = 4;
        char ch = 'A';
        for(int line = 1; line<=a; line++ ){
            for(int chars = 1; chars<=line; chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
       }
    }
}