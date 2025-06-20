import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Choose operator (+,-,*,/): ");
        String operator = sc.nextLine();
        int result = 0;
        if(operator.trim().equals("+")){
            result = num1 + num2;
        } else if(operator.trim().equals("-")){
            result = num1 - num2;
        } else if(operator.trim().equals("*")){
            result = num1 * num2;
        } else if(operator.trim().equals("/")){
            result = num1 / num2;
        } else {
            System.out.println("Operator not defined");
            return;
        }
        System.out.println("Value: " + result);
    }    
}
