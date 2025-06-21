
import java.util.Scanner;

public class nCr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter r: ");
        int r = sc.nextInt();
        double ncr = fact(n)/(fact(r) * fact(n-r));
        double npr = fact(n)/fact(n-r);
        System.out.println("nCr: " + ncr + " nPr: " + npr);
        sc.close();

    }

    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
}
