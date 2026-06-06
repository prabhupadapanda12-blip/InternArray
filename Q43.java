public class Q43 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++) {
            int randomIndex = (int)(Math.random() * arr.length);

            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for(int num : arr)
            System.out.print(num + " ");
    }
}