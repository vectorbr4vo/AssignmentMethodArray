public class Main {
    public static int[] addX(int n, int arr[], int x) {
        int i;
        int newarr[]=new int[n+1];
        for(i=0;i<n;i++)
            newarr[i]=arr[i];
        newarr[n]=x;
        return newarr;
    }
    public static void main(String[] args) {
        int n=10;
        int y;
        int[] arr = new int[10];
        System.out.println("---OLD ARRAY---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int x=50;
        arr=addX(n,arr,x);
        System.out.println();
        System.out.println("---NEW ARRAY---");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
