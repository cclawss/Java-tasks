package com.company.Car;

import com.company.Car.Type.*;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd carAd = new VehicleAd("Car", "22", new CarType(),
                new SedanType(), new PetrolType());

        adsService.setAdList(new VehicleAd[]{volvoAd, kamazAd, carAd});

        adsService.filterByVehicleTypeByPurpose(new PassengerType());
        System.out.println("--------------------------------------------------------------------------");
        adsService.filterByVehicleTypeByFuelTypes(new DieselType());
        System.out.println("--------------------------------------------------------------------------");
        adsService.filterByVehicleTypeByFuelTypes(new PetrolType());
    }
}
