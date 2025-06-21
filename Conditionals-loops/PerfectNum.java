public class PerfectNum{
    public static void main(String[] args) {
        int i = 1;
        while(i < Integer.MAX_VALUE){
            perfectNum(i);
            i++;
        }
        
    }

    public static void perfectNum(int num){
        int sum = 0;
        for(int i = 1 ; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }       
        if(sum == num){
            System.out.print(num + " ");
        } 
    }

    


}