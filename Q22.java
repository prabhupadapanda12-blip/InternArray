public class Q22 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,4};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            } else if(num > second && num != first) {
                second = num;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}