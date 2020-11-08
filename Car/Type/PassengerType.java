package com.company.Car.Type;

import com.company.Car.VehicleTypeByPurpose;
import com.company.Car.VehicleTypeEnum;

public class PassengerType extends VehicleTypeByPurpose {

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }
}