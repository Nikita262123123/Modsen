public class Main {

    public static int findIndex(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target || arr[i] >= target) {
                return i;
            }
            if(i == arr.length - 1) {
                return i + 1;
            }
        }
        return 0;
    }
   public static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = start +  (end - start) / 2;

        if(start == end && end != arr.length - 1) return start;
        if(start == end && end == arr.length - 1) return start + 1;

        if(arr[mid] == target) {
            return mid;
        }


        if(arr[mid] > target) {
           return binarySearch(arr, target, start, mid);
        }
        if(arr[mid] < target) {
           return binarySearch(arr, target, mid + 1, end);
        }



       return mid;
   }

    public static int findIndexBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        return binarySearch(arr, target, start, end);
    }


    public static void main(String[] args) {
        int arr[] = {1,3,5,6};

//        System.out.println(Main.findIndex(arr,0));
        System.out.println(Main.findIndexBinary(arr,5));




    }

}
