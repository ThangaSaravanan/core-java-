public class Count {
    public static void main(String[] args) {
      String test="saravanan@123";
        count(test);

    }

    private static void count(String x) {
        char[] ch =x.toCharArray();
        int letters=0;
        int space=0;
        int num=0;
        int otherCha=0;
        for (int i=0;i<x.length();i++){
            if(Character.isLetter(ch[i])){
                letters ++ ;
            }
           else if (Character.isDigit(ch[i])){
                num++;
            }
           else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else {
                otherCha++;
            }

        }
        System.out.println("the string is: saravanan@123");
        System.out.println("letters :"+letters);
        System.out.println("space : "+space);
        System.out.println("digit :"+num);
        System.out.println("other :"+otherCha);


    }

}
