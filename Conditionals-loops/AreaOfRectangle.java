
import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();
        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        double area = breadth * length;

        System.out.println("Area of rectangle having breadth " + breadth + ", length " + length + " is " + area);
        sc.close();
    }
}
