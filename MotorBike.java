abstract class MotorBike {
    abstract void engineOn() ;
    void engineOff(){
        System.out.println("the bike is off");
    }

     static class SportsBike extends MotorBike {
         void engineOn() {
             System.out.println("the SportsBike is in on");
         }

         void engineOff() {
             System.out.println("the SportsBike is off");
         }

         static class MountainBike extends MotorBike {
             void engineOn() {
                 System.out.println("the MountainBike is in on");
             }

             void engineOff() {
                 System.out.println("the MountainBike is off");
             }


         }
         }
    public static void main(String[] args) {
        SportsBike obj1 = new SportsBike();
        obj1.engineOn();
        obj1.engineOff();
        SportsBike.MountainBike obj2= new SportsBike.MountainBike();
        obj2.engineOn();
        obj2.engineOff();
    }
}