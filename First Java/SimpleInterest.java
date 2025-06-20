import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        int principal = sc.nextInt();
        System.out.println("Enter time: ");
        int time = sc.nextInt();
        System.out.println("Enter rate: ");
        int rate = sc.nextInt();

        double simpleInterest = (principal * (1.0) * time * rate) / 100;
        System.out.println("Simple Interest : " + simpleInterest);

    }
}
