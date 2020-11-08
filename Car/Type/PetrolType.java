package com.company.Car.Type;

import com.company.Car.VehicleTypeByFuelTypes;
import com.company.Car.VehicleTypeEnum;

public class PetrolType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
