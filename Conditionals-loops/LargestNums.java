import java.util.Scanner;

public class LargestNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        while (true) { 
            String input = sc.nextLine();
            int num = Integer.valueOf(input);
            if(num == 0){
                break;
            }   
            if(max < num){
                max = num;
            }
        }
        System.out.println("Max is " + max);
        sc.close();
    }
}
