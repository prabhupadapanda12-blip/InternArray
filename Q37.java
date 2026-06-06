public class Q37 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int index = 2;

        for(int i=0;i<arr.length;i++) {
            if(i != index)
                System.out.print(arr[i] + " ");
        }
    }
}