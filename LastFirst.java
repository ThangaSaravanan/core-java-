import java.util.Arrays;

public class LastFirst {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};

        System.out.println("original array:" + Arrays.toString(arr));
       int i=arr[0];
       arr[0]=arr[arr.length-1];
       arr[arr.length-1]=i;

        System.out.println("reverse array :" + Arrays.toString(arr) );
    }
}
