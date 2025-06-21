import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi = Math.PI;
        
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        double area = pi * Math.pow(radius, 2);
        System.out.println("Area of circle having radius " + radius + " is " + area);
        sc.close();

    }
}