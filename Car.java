public class Car {
    String name;
    int doors,seats;
    boolean dicky;

    Car(String n,int D,int s,boolean d){
        this.name=n;
        this.doors=D;
        this.seats=s;
        this.dicky=d;

    }
    public void method(){
        System.out.println("name of the car is : "+this.name);
        System.out.println("no of doors in the  : "+this.doors);
        System.out.println("no of seats in the : "+this.seats);
        System.out.println("is dicky available in the car : "+this.dicky);
    }



    public static void main(String[] args) {
        Car Swift=new Car("Dezire",4,5,true);
        Car MG=new Car("Hector",4,7,true);
        Swift.method();

        MG.method();



    }
}
