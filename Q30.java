public class Q30 {
    public static void main(String[] args) {
        int arr[] = {231,554,572,962,24,1};

        for(int num : arr) {
            int sum = 0;
            int temp = num;

            while(temp > 0) {
                int digit = temp % 10;

                if(digit % 2 == 0)
                    sum += digit;

                temp /= 10;
            }

            System.out.print(sum + " ");
        }
    }
}