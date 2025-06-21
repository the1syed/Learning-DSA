import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        num = temp;
        System.out.println("Sum of digits of " + num + " is " + sum);
    }
}
