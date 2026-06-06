public class Q33 {
    public static void main(String[] args) {
        int arr[] = {2,0,5,3,1,0,3,1};
        int temp[] = new int[arr.length];
        int index = 0;

        for(int num : arr) {
            if(num == 0)
                temp[index++] = 0;
        }

        for(int num : arr) {
            if(num != 0)
                temp[index++] = num;
        }

        for(int num : temp)
            System.out.print(num + " ");
    }
}