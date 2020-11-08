package com.company.Car.Type;

import com.company.Car.VehicleTypeByBodyTypes;
import com.company.Car.VehicleTypeEnum;

public class BusType extends VehicleTypeByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
