
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num + " is " + fact(num));
        sc.close();
    }

    public static int fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
}
