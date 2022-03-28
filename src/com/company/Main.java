package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
    DiselCar dOne = new DiselCar("AB 010101 ", "Audi ", "A3 ", 2, 25, true);
    GasolinCar gOne = new GasolinCar("AB 020202 ", "BMW ", "320 ", 4, 15);
    FleetOfCars aOne = new FleetOfCars();
    aOne.addCar(gOne);
    aOne.addCar(dOne);
    //One.getFuelType();
        System.out.println(gOne);
        System.out.println(dOne.getRegistrationFee());
        System.out.println(gOne.getRegistrationFee());
        System.out.println(aOne);


    }
}
