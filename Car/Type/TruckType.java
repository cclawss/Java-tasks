package com.company.Car.Type;

import com.company.Car.VehicleTypeByPurpose;
import com.company.Car.VehicleTypeEnum;

public class TruckType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}