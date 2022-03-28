package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class FleetOfCars
{
    // Declare an ArrayList that contains Car objects - useing the interface, which is the most abstract representation of the class Car.
    static ArrayList<Car> cars;

    public FleetOfCars()
    {
        // Initializing the cars ArrayList.
         cars = new ArrayList<>();
    }

    public int getTotalRegFee()
    {
        int totRegFee;

        return 0;
    }

    public void addCar (Car car)
    {
        // Method to add cars to ArrayList.
        cars.add(car);
        //System.out.println("Fra ARRAY " + car);

    }

    @Override
    public String toString()
    {

        // Tobias løsning på dette. Der mangler en smule.
        StringBuilder res = new StringBuilder();
        res.append("Fleet of cars:\n");
        res.append("--------------- \n");
        for (Car car : cars)
        {
            res.append(car.toString());
            res.append("\n");
            res.append("--------------- \n");
        }

       //String listOfCars = Arrays.toString(cars.toArray()).replace("[", "").replace("]", "");
       //listOfCars.split(" , ");
       return res.toString();
    }
}
