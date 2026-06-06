public class Q28 {
    public static void main(String[] args) {
        int arr[] = {23,55,57,93,1};

        for(int num : arr) {
            int rev = 0;

            while(num > 0) {
                rev = rev * 10 + num % 10;
                num /= 10;
            }

            System.out.print(rev + " ");
        }
    }
}