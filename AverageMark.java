public class AverageMark {
    public static void main(String[] args) {
        int sub=5,avg=0;
        int[] arr=new int[sub];
        arr[0]=60;
        arr[1]=70;
        arr[2]=80;
        arr[3]=50;
        arr[4]=40;
        for (int i=0;i<sub;i++){
            avg=avg+arr[i];
        }
        System.out.println("the average mark : "+avg/sub);
    }
}
