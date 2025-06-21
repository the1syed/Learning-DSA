import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first diagonal: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter second diagonal: ");
        double d2 = sc.nextDouble();
        double area = d1 * d2;

        System.out.println("Area of rectangle having diagonals " + d1 + ", " + d2 + " is " + area);
        sc.close();
    }
}
