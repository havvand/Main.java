package com.company;

public abstract class AFuelCar extends ACar
{
    private int kmPrLitre;

    public AFuelCar(String getRegistrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(getRegistrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
    }

    public abstract String getFuelType();

    public int getKmPrLitre ()
    {
        return this.kmPrLitre;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Km/l: " + this.kmPrLitre + "\n";
    }




}
