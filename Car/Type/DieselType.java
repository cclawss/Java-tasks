package com.company.Car.Type;

import com.company.Car.VehicleTypeByFuelTypes;
import com.company.Car.VehicleTypeEnum;

public class DieselType extends VehicleTypeByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
