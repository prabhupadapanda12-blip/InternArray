public class Q45 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int copy[] = new int[arr.length];

        System.arraycopy(arr, 0, copy, 0, arr.length);

        System.out.print("Copied Array: ");
        for(int num : copy) {
            System.out.print(num + " ");
        }
    }
}