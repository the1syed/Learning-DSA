import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) { 
            String input = sc.nextLine();
            int num = Integer.valueOf(input);
            if(num == 0){
                break;
            }   
            sum += num;
        }
        System.out.println("Sum is " + sum);
        sc.close();
    }
}
