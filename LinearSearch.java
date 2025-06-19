public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 2, 9, 7, 5};
        int target = 7;
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println(target + " doesn't exist in array");
        } else {
            System.out.println(target + " is at index " + result);
        }

    }

    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
