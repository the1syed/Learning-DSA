import java.util.Scanner;

public class RsToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupess");
        double rs = sc.nextDouble();
        double dollar = rs * 0.012;
        System.out.println(rs + " Rs in USD is : " + dollar + "$");
    }
}
