import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,};
        int newValue=4;
        int position=3;
        System.out.println("first Array"+ Arrays.toString(arr));
        for (int i= arr.length-1;i>position;i--){
            arr[i]=arr[i-1];
        }
        arr [position]=newValue;
        System.out.println("new array:"+Arrays.toString(arr));

    }
}
