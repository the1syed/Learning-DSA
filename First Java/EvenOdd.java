import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Integer.valueOf(sc.nextLine());
        if(num%2 == 0){
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }

    }    
}
