import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        for(int i = first; i <= second; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int n){
        int temp = n;
        int numOfDigits = (int) Math.log10(n) + 1;
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum = sum + (int) Math.pow(lastDigit, numOfDigits);
            n = n / 10;
        }

        if(sum == temp){
            return true;
        } else {
            return false;
        }
    }


}
