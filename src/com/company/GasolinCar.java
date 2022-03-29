package com.company;
// GIT TEST!
public class GasolinCar extends AFuelCar
{

    public GasolinCar(String getRegistrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(getRegistrationNumber, make, model, numberOfDoors, kmPrLitre);

    }

    public int getRegistrationFee()
    {
        System.out.println("Registration Fee for: " + getRegistrationNumber());
        if (getKmPrLitre () >= 20 && getKmPrLitre () <=50)
        {
            return 330;
        }
        if (getKmPrLitre () >= 15 && getKmPrLitre () <=20)
        {
            return 1050;
        }
        if (getKmPrLitre () >= 10 && getKmPrLitre () <=15)
        {
            return 2340;
        }
        if (getKmPrLitre () >= 5 && getKmPrLitre () <=10)
        {
           return 5500;
        }
        if (getKmPrLitre () < 5)
        {
            return 10470;
        }
        else
        return 0;
    }

    public String getFuelType()
    {
        return "Petrol";
    }

    @Override
    public String toString()
    {
        return super.toString() + "Fuel type: " + getFuelType() + "\n";
    }
}
