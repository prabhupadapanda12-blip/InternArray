public class Q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int evenIndexSum = 0;
        int oddIndexSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                evenIndexSum += arr[i];
            else
                oddIndexSum += arr[i];
        }

        System.out.println("Even Index Sum = " + evenIndexSum);
        System.out.println("Odd Index Sum = " + oddIndexSum);
    }
}