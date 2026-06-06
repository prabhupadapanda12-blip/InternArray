public class Q41 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,13};

        for(int i=arr[0]; i<=arr[arr.length-1]; i++) {
            boolean found = false;

            for(int j=0;j<arr.length;j++) {
                if(i == arr[j]) {
                    found = true;
                    break;
                }
            }

            if(!found)
                System.out.print(i + " ");
        }
    }
}