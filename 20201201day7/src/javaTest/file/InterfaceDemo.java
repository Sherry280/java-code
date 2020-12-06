package javaTest.file;

import javaTest.file.Airplane;
import javaTest.file.Car;
import javaTest.file.Travel;

public class InterfaceDemo {
    public static void main(String[] args) {
        Travel carTravel=new Car();
        carTravel.setWay("Car");
        System.out.println(carTravel.getTravelWay());

        Travel airplaneTravel=new Airplane();
        airplaneTravel.setWay("airplane");
        System.out.println(airplaneTravel.getTravelWay());

        if(carTravel instanceof Car){
            Car car=(Car)carTravel;
            System.out.println(car.getTravelWay());
        }


    }


}
