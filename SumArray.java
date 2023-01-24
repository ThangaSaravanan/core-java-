public class SumArray {
    public static void main(String[] args) {
        int sum=0 ;
        int[] arr={1,2,3,4,5};
        for ( int i=0;i<= arr.length;i++){
        sum =sum+i;
        }
       // for (int i :arr) {
       //     sum += i;
      //  }

    System.out.println("the sum of given array : "+sum);
    }
}
