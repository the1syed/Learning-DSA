import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = Math.PI;
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of circle having radius " + radius + " is " + perimeter);
        sc.close();
    }
}
