public class Q9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int sum = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        System.out.println("Sum = " + sum);
    }
}