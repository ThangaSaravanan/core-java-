public class AverageArray {
    public static void main(String[] args) {
        int sum=0,avg=0;
        int[] arr={10, 20, 30, 60, 80, 100};
        for (int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            avg=sum/ arr.length;

        }
        System.out.println("the average value of given array : "+avg);
    }
}
