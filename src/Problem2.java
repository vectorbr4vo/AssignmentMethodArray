public class Problem2 {
    public static int[] remove(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] arr2 = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            arr2[k++] = arr[i];
        }
        return arr2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("---OLD ARRAY---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       int index=9;
        arr=remove(arr,index);
        System.out.println();
        System.out.println("---NEW ARRAY---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
