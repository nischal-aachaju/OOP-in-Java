abstract class Vehicle {
       abstract double calculateSpeed();
       abstract  double calculateFuleEfficiency();

       void display(){
        System.out.println("Speed:  "+calculateSpeed()+" km/h Fule Efficiency: "+calculateFuleEfficiency() +" l/h");
       }
}
class Car extends  Vehicle{
     double distance;
      double time;
      double fuleUsed;

    public Car(double distance,double time,double  fuleUsed) {
    this.distance=distance;
    this.time=time;
    this.fuleUsed=fuleUsed;
    }
    @Override
    double calculateSpeed(){
    return  (this.distance/this.time);
    }

    @Override
    double calculateFuleEfficiency(){
        return (this.fuleUsed/this.time);
    }

}


class Bike extends  Vehicle{
    double distance ;
    double time;
    double fuleUsed;
    

    public Bike(double  distance ,double  time,double  fuleUsed) {
        this.distance =distance;
        this.time= time;
        this.fuleUsed= fuleUsed;
    }
    @Override
    double calculateFuleEfficiency(){
        return (this.fuleUsed/this.time);
    }
    @Override
    double calculateSpeed(){
        return  (this.distance/this.time);
    }

}
public class MainVehicle{
    public static void main(String[] args) {
        Car c1=new Car(30, 10, 5);
        Bike b1=new Bike(50,20, 2);
        c1.display();
        b1.display();
    }

}
