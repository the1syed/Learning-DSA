import java.util.Scanner;

public class PerimeterEquiTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter side: ");
        double side = sc.nextDouble();
        double perimeter = 3 * side;
        System.out.println("Perimeter of equilateral triangle having side " + side + " is " + perimeter);
        sc.close();
    }
}
