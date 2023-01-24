import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    String name;
    String degree;
    String location;
    int std,age;
    Teacher(String n,String d,String l,int s,int a){
        this.name=n;
        this.degree=d;
        this.location=l;
        this.age=a;
        this.std=s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("name : "+this.name);
        System.out.println("degree : "+this.degree);
        System.out.println("location : "+this.location);
        System.out.println("age : "+this.age);
        System.out.println("std : "+this.std);
    }
    public  static int  method1(ArrayList<Teacher> teachersList) {
       int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the location");
        String  location= input.nextLine();

        for (Teacher teacher : teachersList){

            if ( teacher.getLocation().equals(location)){
                count++;
            }
        }
        return count;
    }
    public static int method2(ArrayList<Teacher> teachersList){
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the std");
        int  std= input.nextInt();


        Scanner in=new Scanner(System.in);
        System.out.println("enter the location");
        String  location= in.nextLine();
        for (Teacher teacher:teachersList){
            if (teacher.getStd()==std&&teacher.getLocation().equals(location)){
                count++;
            }
        }

    return count;
    }
    public static int method3( ArrayList<Teacher> teachersList){
        int totalAge=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the location");
        String  location= in.nextLine();
        for (Teacher teacher:teachersList){
            if (teacher.getLocation().equals(location)){
              totalAge +=teacher.getAge();

            }
        }
      return totalAge;
    }
    public static int method4(ArrayList<Teacher> teachersList ,int minAge,int maxAge){
        int count =0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the degree");
       String degree= input.nextLine();
        for (Teacher teacher:teachersList){
            if (teacher.getDegree().equals(degree)&&teacher.getAge()>minAge&&teacher.getAge()<maxAge){
          count++;
            }
        }
        return count;
    }
    public static int method5(ArrayList<Teacher> teachersList){
        int count=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the age");
        int age= input.nextInt();
        for (Teacher teacher:teachersList){
            if (teacher.getAge()<age){
                count++;
            }
        }
        return count;

    }



    public static void main(String[] args) {
        ArrayList<Teacher> teachersList = new ArrayList<Teacher>();


        Teacher t1 = new Teacher("aa", "BE", "ond", 1, 20);

        Teacher t2 = new Teacher("bb", "ME", "ond", 2, 21);

        Teacher t3 = new Teacher("cc", "BE", "tnd", 1, 20);

        Teacher t4 = new Teacher("dd", "ME", "tnd", 2, 21);

        Teacher t5 = new Teacher("ee", "BE", "pkt", 3, 22);

        Teacher t6 = new Teacher("ff", "ME", "pkt", 4, 23);

        Teacher t7 = new Teacher("gg", "BE", "mannai", 3, 22);

        Teacher t8 = new Teacher("hh", "ME", "mannai", 5, 23);

        Teacher t9 = new Teacher("ii", "BE", "chennai", 4, 24);

        Teacher t10 = new Teacher("jj", "ME", "chennai", 5, 24);

        teachersList.add(t1);
        teachersList.add(t2);
        teachersList.add(t3);
        teachersList.add(t4);
        teachersList.add(t5);
        teachersList.add(t6);
        teachersList.add(t7);
        teachersList.add(t8);
        teachersList.add(t9);
        teachersList.add(t10);
        for (Teacher t:teachersList){
            t.display();
        }


        System.out.println("the no of teachers in this location : "+Teacher.method1(teachersList));

        System.out.println("the no of teachers in this location &std : "+Teacher.method2(teachersList));
        System.out.println("the no of teachers in this location &total age : "+Teacher.method3(teachersList));
        System.out.println("the teachers degree and max min age members : "+Teacher.method4(teachersList,20,40));
        System.out.println("the no of teachers below given age : "+Teacher.method5(teachersList));

    }
    }
/* ArrayList<Teacher> list=new ArrayList<Teacher>();

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
            list.get(8).display();*/