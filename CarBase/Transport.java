package com.company.CarBase;

import java.util.Objects;

public class Transport {
    private final String number;
    private String model;
    private String color;
    private String type;

    public Transport(String number, String model, String color, String type) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(number, transport.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
