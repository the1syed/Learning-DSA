public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 2, 9, 7, 5};
        int target = 7;
        int result = binarySearchIterative(arr, target);
        if(result == -1){
            System.out.println(target + " doesn't exist in array");
        } else {
            System.out.println(target + " is at index " + result);
        }
        result = binarySearchRecursive(arr, target, 0 , arr.length-1);
        if(result == -1){
            System.out.println(target + " doesn't exist in array");
        } else {
            System.out.println(target + " is at index " + result);
        }
    }

    public static int binarySearchIterative(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                return mid;
            } else if(target < arr[mid]){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int low, int high){
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target){
                return mid;
            } else if(target < arr[mid]){
                return binarySearchRecursive(arr, target, low, mid - 1);
            } else {
                return binarySearchRecursive(arr, target, mid + 1, high);
            }
        }
        return -1;
    }
}
