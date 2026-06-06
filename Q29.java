public class Q29 {
    public static void main(String[] args) {
        int a[] = {2,3,4,1};
        int b[] = {2,3,5,6,7,8,9};

        int max = Math.max(a.length, b.length);

        for(int i=0;i<max;i++) {
            int x = (i < a.length) ? a[i] : 0;
            int y = (i < b.length) ? b[i] : 0;

            System.out.print((x + y) + " ");
        }
    }
}