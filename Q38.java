public class Q38 {
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6};
        int b[] = {2,5,8,9,3,1};

        for(int i=0;i<a.length;i++) {
            boolean found = false;

            for(int j=0;j<b.length;j++) {
                if(a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if(!found)
                System.out.print(a[i] + " ");
        }

        for(int i=0;i<b.length;i++) {
            boolean found = false;

            for(int j=0;j<a.length;j++) {
                if(b[i] == a[j]) {
                    found = true;
                    break;
                }
            }

            if(!found)
                System.out.print(b[i] + " ");
        }
    }
}