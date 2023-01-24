import java.util.ArrayList;


public class ThreeSortedArray {

    public static void main(String[] args) {
            ArrayList<Integer> common =new ArrayList<Integer>();
            int[] arr1 ={2,4,5,8,9,12,14};
            int[] arr2 ={2,3,4,8,9,12};
            int[] arr3 ={1,4,8,12,18};
            int x=0,y=0,z=0;
            while (x< arr1.length && y< arr2.length && z< arr3.length) {
                if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                    common.add(arr1[x]);
                    x++;
                    y++;
                    z++;
                } else if (arr1[x] < arr2[y])
                    x++;
                else if (arr2[y] < arr3[z])
                    y++;
                else z++;
            }
            System.out.println("the common elements of three sorted arrays :");
            System.out.println(common);
        ArrayList<Teacher> list=new ArrayList<Teacher>();

        String[] n={"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj"};
        String[] l={"ond","ond","ond","ond","ond","tnj","tnj","tnj","tnj","tnj"};
        String[] d={"BE","ME","BE","ME","BE","ME","BE","ME","BE","ME"};
        int[] s={1,1,1,2,2,2,3,3,3,4};
        int[] a={20,21,20,22,21,22,23,25,23,25};

        for (int i=0;i<=9;i++){
            Teacher t =new Teacher(n[i],l[i],d[i],s[i],a[i] );

            list.add(t);
        }
        list.get(0).display();
        list.get(1).display();
        list.get(2).display();
        list.get(3).display();
        list.get(4).display();
        list.get(5).display();
        list.get(6).display();
        list.get(7).display();
        list.get(8).display();
        list.get(9).display();
        }
    }


