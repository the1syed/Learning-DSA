import java.util.Scanner;

public class AreaOfEquiTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter side: ");
        double side = sc.nextDouble();
        double area = (Math.cbrt(3)/4) * Math.pow(side, 2);
        System.out.println("Area of equilateral triangle having side " + side + " is " + area);
        sc.close();
    }
}
