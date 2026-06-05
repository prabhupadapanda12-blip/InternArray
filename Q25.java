public class Q25{
    public static void main(String[] args) {
        int arr[] = {23,55,57,93,10,1};

        for(int num : arr) {
            while(num > 9) {
                int sum = 0;

                while(num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                num = sum;
            }

            System.out.print(num + " ");
        }
    }
}