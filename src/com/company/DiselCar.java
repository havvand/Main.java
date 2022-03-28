package com.company;

public class DiselCar extends AFuelCar
{
    boolean particleFilter;
    int particleFee;

    public DiselCar(String getRegistrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter)
    {
        super(getRegistrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.particleFilter = particleFilter;
        this.particleFee = hasParticleFilter();
    }


   public int hasParticleFilter() {
       if (!particleFilter) {
           return 1000;
       } else {
           return 0;
       }
   }


   public int getRegistrationFee()
   {
       System.out.println("Registraton Fee for: " + getRegistrationNumber());
       if (getKmPrLitre () >= 20 && getKmPrLitre () <=50)
       {
           return 330+130+particleFee;
       }
       if (getKmPrLitre () >= 15 && getKmPrLitre () <=20)
       {
           return 1050+1390+particleFee;
       }
       if (getKmPrLitre () >= 10 && getKmPrLitre () <=15)
       {
           return 2340+1850+particleFee;
       }
       if (getKmPrLitre () >= 5 && getKmPrLitre () <=10)
       {
           return 5500+2770+particleFee;
       }
       if (getKmPrLitre () < 5)
       {
           return 10470+15260+particleFee;
       }
       else
           return 0;
   }

    public String getFuelType()
    {
        return "Diesel";
    }

   @Override
   public String toString()
   {
       return super.toString() + "Fuel type: " + getFuelType() + "\n" + "Has particle filter: " + hasParticleFilter();
   }
}
