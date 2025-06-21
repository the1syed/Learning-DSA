import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        double area = 0.5 * breadth * height;

        System.out.println("Area of triangle having breadth " + breadth + ", height " + height + " is " + area);
        sc.close();
    }
}
