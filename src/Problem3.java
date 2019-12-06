public class Problem3 {
    public static int[] insert(int[] arr, int value, int pos) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[pos] = value;
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("---OLD ARRAY---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        arr=insert(arr, 10, 0);
        arr=insert(arr,20,1);
        arr=insert(arr, 50,4);
        arr=insert(arr,100,9);
        //arr
        //arr=remove??
        System.out.println();
        System.out.println("---NEW ARRAY---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
