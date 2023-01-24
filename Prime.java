public class Prime {
    public static void main(String[] args) {
        int sum=1,p=0,n=0;

        while (p<100){
            n++;
            if (n%2!=0){
                if (is_Prime(n)){
                    sum +=n;
                }

            }
        p++;
        }
    System.out.println("\nthe sum of the prime numbers till 100:"+sum);
    }

    private static boolean is_Prime(int n) {

        for (int i=3;i*i<=n;i+=2){
            if (n%i==0){
                return false;
            }
        }
    return true;

}
}
